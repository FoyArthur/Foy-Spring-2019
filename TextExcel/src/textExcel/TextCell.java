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
		if(input.length() > 10) {
			return(input.substring(0, 10));
		}else {
			return (input);
		}
	}
}
