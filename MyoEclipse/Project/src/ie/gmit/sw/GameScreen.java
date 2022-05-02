package ie.gmit.sw;

import java.awt.Canvas;
import java.awt.Graphics2D;

import ie.gmit.sw.Statator;
import ie.gmit.sw.Player;

public class GameScreen implements Statator{
	
	//player cannon
		private Player cannon;

		public GameScreen() {
			// send the constructor the positions 
			cannon = new Player(150, 150, 50, 50);
		}

	@Override
	public void update(double delta) {
		cannon.update(delta);
	}

	@Override
	public void draw(Graphics2D g) {
		cannon.draw(g);
	}

	@Override
	public void init(Canvas canvas) {
		canvas.addKeyListener(cannon);
	}

}