package textExcel;
//@author ArthurFoy
public class PercentCell extends RealCell {
	String[] arr;
	private String userInput;
	public PercentCell(String input) {
		super(input);
		userInput = input;
	}
	
	public String fullCellText() {
		return (getDoubleValue()/100 + "");
	}

	public String abbreviatedCellText() {
		int douglas = (int) getDoubleValue();
		return((douglas + "%          ").substring(0,10)); 
	}
		
	public double getDoubleValue() {
		return Double.parseDouble(userInput.substring(0, userInput.length() - 1));
	}
}
