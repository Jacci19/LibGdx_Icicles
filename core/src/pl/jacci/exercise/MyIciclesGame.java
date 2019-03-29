package pl.jacci.exercise;

import com.badlogic.gdx.Game;

import pl.jacci.exercise.screens.IciclesScreen;
import pl.jacci.exercise.screens.TitleScreen;

public class MyIciclesGame extends Game {

	@Override
	public void create() {
		showTitleScreen();
	}


	void showTitleScreen(){
		setScreen(new TitleScreen());
	}

	void showIciclesScreen(){
		setScreen(new IciclesScreen());
	}



}
