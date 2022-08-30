package com.xworkz.runners;

import com.xworkz.interfaces.InterfaceImplementation;

public class KeyBoardRunner {

	public static void main(String[] args) {
		//this is a interface class we can't create object
		//KeyBoard key = new KeyBoard();
		//KeyboardVersion name = new KeyboardVersion();
		InterfaceImplementation key = new InterfaceImplementation();
		key.keyBoardStandart();
		key.version();
		key.keyBoardStandart();
		key.run();
	}
}
