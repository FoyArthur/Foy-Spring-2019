//@author ArthurFoy
//@date 3/29/2019
package textExcel;

//cell for when user enters string
public class TextCell implements Cell {
	private String returnString;
	private String full;
	public TextCell(String input) {
		returnString = input;
		full = input;
	}
	
	//returns original String user entered
	public String fullCellText() {
		return("\"" + full + "\""); 
	}
	
	//returns abbreviated userInput 10 spaces long
	public String abbreviatedCellText() {
		returnString += "          ";
		return(returnString.substring(0, 10));
	}
}
