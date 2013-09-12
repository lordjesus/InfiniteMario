package dk.itu.mario.level;

import dk.itu.mario.MarioInterface.GamePlay;
import dk.itu.mario.MarioInterface.LevelGenerator;
import dk.itu.mario.MarioInterface.LevelInterface;

public class SuperGenerator implements LevelGenerator {

	@Override
	public LevelInterface generateLevel(GamePlay playerMetrics) {
//		LevelInterface level = new CustomizedLevel(320,15,new Random().nextLong(),1,1,playerMetrics);
		LevelInterface level = new NiceLevel(320,15);
		return level;
	}

	@Override
	public LevelInterface generateLevel(String detailedInfo) {
		// TODO Auto-generated method stub
		return null;
	}

}
