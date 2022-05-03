package ie.gmit.sw;

import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;

import ie.gmit.sw.Block.Blocks;
import ie.gmit.sw.Bullet.Bullets;
import ie.gmit.sw.Enemy.Aliens;
import ie.gmit.sw.Player.Player;
import ie.gmit.sw.Score.ScoreBoard;

public class Runner extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private javax.swing.Timer myTimer;

	// first JPanel
	private static GameScreen menu;
	private boolean gameStart = false;

	// check if game is paused
	private boolean paused = false;
	// start again
	private boolean startAgain;

	// component classes of the game
	private static Controller overseer;
	private Player player;
	private Aliens enemies;
	private ScoreBoard score;
	private Blocks shield;
	private Bullets shotsFired;
	// number of wins by the user, keeps track of subsequent alien start location
	private int wave = 0;

	public Runner() throws IOException, FontFormatException {
		super("GUI Project");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(null);
		setSize(770, 652);

		menu = new GameScreen();
		score = new ScoreBoard();

		menu.setHiScore(score.getHiScore());

		// add menu to the JFrame
		add(menu);

		// update every 10 ms
		myTimer = new javax.swing.Timer(10, this);
		myTimer.start();

		setResizable(false);
		setVisible(true);
	}

	private void nextLevel() throws IOException, FontFormatException {
		// called every time user wins (all aliens destroyed), resets game setup
		remove(overseer);
		if (wave < 10) {
			wave += 1;
		}
		player.addLife();
		enemies = new Aliens(wave, score, player, shield);
		shotsFired = new Bullets(player, enemies, shield);
		overseer = new Controller(player, enemies, score, shield, shotsFired);
		add(overseer);
	}

	private void startOverGame() throws IOException, FontFormatException {

		if (overseer != null) {
			remove(overseer);
		}

		wave = 0;
		player = new Player();
		shield = new Blocks();
		score.setShip(player);
		score.resetScore();
		enemies = new Aliens(wave, score, player, shield);
		shotsFired = new Bullets(player, enemies, shield);
		overseer = new Controller(player, enemies, score, shield, shotsFired);
		add(overseer);
	}

	// event listener stuff, update classes every 10 ms
	public void actionPerformed(ActionEvent evt) {

		Object source = evt.getSource();
		// check if pasued or not
		paused = menu.getPauseStatus();

		if (source == myTimer) {
			if (gameStart) {
				if (overseer.stillPlaying() && !overseer.isPaused() && !player.gotHit()) {
					// only move when not paused and player still alive
					// move player
					overseer.move();
					// if aliens have moved
					if (enemies.metronome()) { 
						// launch attack
						shotsFired.setAlienShots(enemies.attack());
					}
					// move mystery UFO regardless of beat
					enemies.ufoTrack();
					// move shots if they exist
					shotsFired.trackBullets();
				}

				if (!overseer.stillPlaying()) {

					// start again
					startAgain = menu.startOver();

					// delete everything
					enemies.ufoDestroy();
					score.calculateHiScore();

					// start again
					if (startAgain) {
						try {
							menu.setStartOver(false);
							startOverGame();
						} catch (IOException | FontFormatException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

				}

				overseer.repaint();

				if (enemies.aliensGone()) { // if no aliens left
					// error handling in case font doesn't exist
					try {
						nextLevel();
					} catch (IOException e) {
						e.printStackTrace();
					} catch (FontFormatException e) {
						e.printStackTrace();
					}
				}

				if (overseer.doRestartGame()) { // check if player wants to restart game
					// error handling in case font doesn't exist
					try {
						startOverGame();
					} catch (IOException e) {
						e.printStackTrace();
					} catch (FontFormatException e) {
						e.printStackTrace();
					}
				}

				// this here pauses the game but at the moment its very buggy
				// resume the game
				if (paused) {
					overseer.setPaused(true);
					overseer.repaint();
				}
				if (!paused) {
					overseer.setPaused(false);
					overseer.repaint();
				}
			} else {
				gameStart = menu.getStatus();
				// initialize if player starts game
				if (gameStart) {
					remove(menu);

					// error handling in case font doesn't exist
					try {
						startOverGame();
					} catch (IOException e) {
						e.printStackTrace();
					} catch (FontFormatException e) {
						e.printStackTrace();
					}
				}

				menu.repaint();
			}

		}
	}

	public static void main(String[] args) throws IOException, FontFormatException {
		new Runner();

		// run the speech recognition to start the game
		menu.sppech();

	}
}
