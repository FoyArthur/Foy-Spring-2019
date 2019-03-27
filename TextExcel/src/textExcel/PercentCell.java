package textExcel;
//@author ArthurFoy
public class PercentCell extends RealCell {
	String[] arr;
	private String userInput;
	private String abbrev;
	public PercentCell(String input) {
		super(input);
		userInput = input;
	}
	
	public String fullCellText() {
		return (getDoubleValue()/100 + "");
	}

	public String abbreviatedCellText() {
		if(userInput.indexOf(".") != -1) {
			arr = userInput.split(".", 2);
			abbrev = (arr[0] + "%          ");
			return(abbrev.substring(0,10));
		}else {
			return(super.abbreviatedCellText());
		}
	}
		
	public double getDoubleValue() {
		return super.getDoubleValue();
	}
}
