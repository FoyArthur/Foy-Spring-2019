package textExcel;

public class TextCell implements Cell {
	private String input;
	public TextCell(String input) {
		this.input = input;
	}
	
	public String fullCellText() {
		return ("\"" + input + "\""); 
	}
	
	public String abbreviatedCellText() {
		input += "          ";
		return(input.substring(0, 10));
	}
}
