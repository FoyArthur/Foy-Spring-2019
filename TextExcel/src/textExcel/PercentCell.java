//@author ArthurFoy
//@date 3/29/2019
package textExcel;

//this cell is for percents
public class PercentCell extends RealCell {
	String[] arr;
	private String userInput;
	public PercentCell(String input) {
		super(input);
		userInput = input;
	}
	
	//returns decimal value of percent entered
	public String fullCellText() {
		return (getDoubleValue()/100 + "");
	}

	//returns percent without decimal rounded down
	public String abbreviatedCellText() {
		int integer = (int) getDoubleValue();
		return((integer + "%          ").substring(0,10)); 
	}
	
	//returns double which is number entered without percent sign
	public double getDoubleValue() {
		return Double.parseDouble(userInput.substring(0, userInput.length() - 1));
	}
}
