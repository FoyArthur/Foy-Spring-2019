//@author Arthur Foy

package textExcel;


import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args)
	{
	    // Add your command loop here
		Scanner userInput = new Scanner(System.in);
    	System.out.println("Input commands.");
    	String input = userInput.nextLine();
    	Spreadsheet inputSheet = new Spreadsheet();
    	while(input.equals("quit") != true) {
    		System.out.println(inputSheet.processCommand(input));
    		System.out.println("Input commands.");
    		input = userInput.nextLine();
    	}
    	System.err.println("Spreadsheet ended!!!");
	}
}
