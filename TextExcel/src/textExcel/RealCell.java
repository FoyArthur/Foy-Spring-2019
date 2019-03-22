package textExcel;

public class RealCell implements Cell{
	private String userInput;
	private String abbrev;
	private double dub;
	public RealCell(String input) {
		userInput = input;
		abbrev = input;
	}
	public String fullCellText() {
		return ("\"" + userInput + "\"");
	}
	public String abbreviatedCellText() {
			abbrev += "          ";
			return(abbrev.substring(0, 10));
	}
	public double getDoubleValue() {
		return dub;
	}
}
