package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel{

	public static void main(String[] args){
    	Scanner userInput = new Scanner(System.in);
    	System.out.println("Input fractions.");
    	String input = userInput.nextLine();
    	while(input.equals("quit") != true) {
    		System.out.println(produceAnswer(input));
    		System.out.println("Input fractions");
    		input = userInput.nextLine();
    	}
	    // Add your command loop here
	}
}
