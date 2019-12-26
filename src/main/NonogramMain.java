package main;

import java.util.List;

import config.Config;
import input.NonogramReader;

public class NonogramMain {

	public static void main(String[] args) {
		
		List<String> inputLines = new NonogramReader(Config.INPUT_PATH).readRawInput();
		
		for(String item : inputLines) { 
			System.out.println(item); 
		}
	}

}
