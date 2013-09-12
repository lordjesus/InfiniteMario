package dk.itu.mario.level;

import java.util.Random;

import dk.itu.mario.engine.sprites.Enemy;
import dk.itu.mario.engine.sprites.SpriteTemplate;

public class NiceLevel extends Level {
	Random rand = new Random();
	
	public NiceLevel(int width, int height) {
		super(width, height);
		
		creat();
	}
	
	private void creat() {
		generateGround();
		
//		setBlock(0, 13, HILL_TOP);
//		setBlock(1, 13, HILL_TOP);
//		setBlock(2, 13, ROCK);
//		setBlock(3, 13, ROCK);
//		setBlock(4, 13, HILL_TOP);
		this.yExit = 30;
		this.xExit = 10;
		
		setSpriteTemplate(4, 11, new SpriteTemplate(Enemy.ENEMY_RED_KOOPA,true));
	}
	
	private void generateGround() {
		for (int i = 0; i < this.width; i++) {
			if(rand.nextDouble() <= 0.33) setSpriteTemplate(i, 1, new SpriteTemplate(Enemy.ENEMY_RED_KOOPA,rand.nextBoolean()));
			setBlock(i, 13, HILL_TOP);
			setBlock(i, 14, GROUND);
		}
	}
}
