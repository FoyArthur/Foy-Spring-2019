package textExcel;

public class TextCell implements Cell {
	private String returnString;
	public TextCell(String input) {
		returnString = input;
	}
	
	public String fullCellText() {
		return ("\"" + returnString + "\""); 
	}
	
	public String abbreviatedCellText() {
		returnString += "          ";
		return(returnString.substring(0, 10));
	}
}
