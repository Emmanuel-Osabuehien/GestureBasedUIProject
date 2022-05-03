package ie.gmit.sw;

import java.awt.Graphics2D;

import ie.gmit.sw.Blocks;

public interface LevelInterface {

	//draw and update 
	void draw(Graphics2D g);
	void update(double delta, Blocks blocks);
	void hasDirectionChange(double delta);
	void changeDurectionAllEnemys(double delta);

	//gameover
	boolean isGameOver();
	boolean isComplete();

	//reset 
	void destory();
	void reset();
}