package ie.gmit.sw;

import java.awt.Canvas;
import java.awt.Graphics2D;

import ie.gmit.sw.Statator;
import ie.gmit.sw.Player;
import ie.gmit.sw.Blocks;

public class GameScreen implements Statator{
	
	//player cannon
		private Player cannon;
		
		// this is the height and widgth of the canvas 
		private float canvasWidth = 770;
		private float canvasHeight = 652;
		
		private Blocks blocks;

		public GameScreen() {
			// send the constructor the positions 
			cannon = new Player(canvasWidth/2-50,canvasHeight-100 , 50, 50, blocks);
			blocks = new Blocks();
		}

	@Override
	public void update(double delta) {
		cannon.update(delta);
	}

	@Override
	public void draw(Graphics2D g) {
		cannon.draw(g);
		blocks.draw(g);
	}

	@Override
	public void init(Canvas canvas) {
		canvas.addKeyListener(cannon);
	}

}