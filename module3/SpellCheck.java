package edu.seminolestate.module3;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
 * Author: Melissa Mink
 * Project: Module 3 Assignment
 * Date: September 2018
 * Write a program that does spell checking. The program should do spell checking as follows:
 * 1. The program should accept two text file names on the command line
 * 2. The program should read both files into string variables. 
 *    The first is the file to check, and the second is the dictionary.
 * 3. Both strings should be split into lists of words (two ArrayList collections)
 * 4. Implement your main loop. For each word in the document file, if that word doesn't 
 *    exist in the dictionary, print it out, saying that it is an unknown word
 * 5. Submit your source code and a couple of screen shots showing your program in action
 * 6. Add your spell checker application to your GitHub repo. Submit a screen shot
 */

public class SpellCheck {
	
	
	public static void main(String[] args) throws IOException {
		
		//The program should read both files into string variables. The first is the file to check, and the second is the dictionary.
		String testStatesPath = new String(Files.readAllBytes(Paths.get("/edu.seminolestate.module3/edu/seminolestate/module3/testStates.txt")), StandardCharsets.UTF_8); 
		String dictionaryPath = new String(Files.readAllBytes(Paths.get("/edu.seminolestate.module3/edu/seminolestate/module3/dictionaryPath.txt")), StandardCharsets.UTF_8); 

		
		//Both strings should be split into lists of words (two ArrayList collections)		
		List<String> al1 = new ArrayList<String>();
		al1 = Arrays.asList(testStatesPath);
		List<String> al2 = new ArrayList<String>();
		al2 = Arrays.asList(dictionaryPath);
		
		//Implement your main loop. For each word in the document file, if that word doesn't exist in the dictionary, print it out, saying that it is an unknown word
		for (String state: al1) {
			  if (al2.contains(state)) {
			    break;
			  } else {
			    int i = 0;
				System.out.println("Unknown word: " + al1.get(i));
			    }
			  }
	}
}
