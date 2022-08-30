package com.xworkz.interfaces;

import com.xworkz.inferfacesone.KeyBoard;
import com.xworkz.interfacestwo.KeyboardVersion;

public class InterfaceImplementation implements KeyBoard,KeyboardVersion {

	@Override
	public void version() {
		System.out.println("version 2");
	}

	@Override
	public void keyBoardStandart() {
		System.out.println("QWERTY key board standard");
	}
	
}
