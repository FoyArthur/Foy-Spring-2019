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
    	while(input.equals("quit") != true) {
    		Spreadsheet inputSheet = new Spreadsheet();
    		System.out.println(inputSheet.processCommand(input));
    		SpreadsheetLocation loc = new SpreadsheetLocation(input);
    		System.out.println(loc.getRow() + " " + loc.getCol());
    		System.out.println("Input commands.");
    		input = userInput.nextLine();
    	}
    	System.err.println("Spreadsheet ended!!!");
	}
}
