package textExcel;
//@author: arthurfoy
public class ValueCell extends RealCell  {
	private String userInput;
	public ValueCell(String input) {
		super(input);
		userInput = input;
	}
	public String fullCellText() {
		return super.fullCellText();
	}
	
	public String abbreviatedCellText() {
		return super.abbreviatedCellText();
	}
	
	public double getDoubleValue() {
		return super.getDoubleValue();
	}
}
