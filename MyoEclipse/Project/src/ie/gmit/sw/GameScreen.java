package ie.gmit.sw;

import java.awt.Canvas;
import java.awt.Graphics2D;

import ie.gmit.sw.Statator;
import ie.gmit.sw.Player;
import ie.gmit.sw.Blocks;
import ie.gmit.sw.LevelOne;

public class GameScreen implements Statator{
	
	//player cannon
		private Player cannon;
		
		// this is the height and widgth of the canvas 
		private float canvasWidth = 770;
		private float canvasHeight = 652;
		
		private Blocks blocks;

		private LevelOne level;

		public GameScreen(){
			//instaisiate block()
			blocks = new Blocks();
			// send the constructor the positions 
			cannon = new Player(canvasWidth/2-50,canvasHeight-100 , 50, 50, blocks);
			level = new LevelOne(cannon);
		}

	@Override
	public void update(double delta) {
		cannon.update(delta);
		level.update(delta, blocks);
	}

	@Override
	public void draw(Graphics2D g) {
		cannon.draw(g);
		blocks.draw(g);
		level.draw(g);
	}

	@Override
	public void init(Canvas canvas) {
		canvas.addKeyListener(cannon);
	}

}