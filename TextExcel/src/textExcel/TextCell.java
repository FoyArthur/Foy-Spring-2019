package textExcel;

public class TextCell implements Cell {
	private String returnString;
	private String full;
	public TextCell(String input) {
		returnString = input;
		full = input;
	}
	
	public String fullCellText() {
		return("\"" + full + "\""); 
	}
	
	public String abbreviatedCellText() {
		returnString += "          ";
		return(returnString.substring(0, 10));
	}
}
