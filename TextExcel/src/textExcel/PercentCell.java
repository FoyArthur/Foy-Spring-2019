package textExcel;
//@author ArthurFoy
public class PercentCell extends RealCell {
	String[] arr;
	private String userInput;
	private int douglas;
	public PercentCell(String input) {
		super(input);
		userInput = input;
	}
	
	public String fullCellText() {
		return (getDoubleValue()/100 + "");
	}

	public String abbreviatedCellText() {
		if(userInput.indexOf(".") != -1) {
			douglas = (int) getDoubleValue();
			return((douglas + "          ").substring(0,10)); 
		}else {
			return(super.abbreviatedCellText());
		}
	}
		
	public double getDoubleValue() {
		returnsuper.getDoubleValue();
	}
}
