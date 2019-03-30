//@author Arthur Foy
//@date 3/29/2019

package textExcel;


import java.io.FileNotFoundException;
import java.util.Scanner;

// CLIENT CODE
public class TextExcel
{

	public static void main(String[] args){
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
    	System.out.println("Spreadsheet ended!!!");
	}
}
