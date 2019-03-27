package textExcel;
//@author: Arthur Foy
public class RealCell implements Cell{
	private String userInput;

	public RealCell(String input) {
		userInput = input;
	}
	public String fullCellText() {
		return userInput;
	}
	public String abbreviatedCellText() {
			String abbrev = getDoubleValue() + "          ";
			return(abbrev.substring(0, 10));
	}
	public double getDoubleValue() {
		return Double.parseDouble(userInput);
	}
}