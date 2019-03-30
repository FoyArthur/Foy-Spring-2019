//@author ArthurFoy
//@date 3/29/2019
package textExcel;

//Cell for when user enters number
public class ValueCell extends RealCell  {
	private String userInput;
	public ValueCell(String input) {
		super(input);
		userInput = input;
	}
	
	//returns String that user originally entered
	public String fullCellText() {
		return super.fullCellText();
	}
	
	//returns abbreviated String of user input 10 spaces long
	public String abbreviatedCellText() {
		return super.abbreviatedCellText();
	}
	
	//returns double of user input converted to double
	public double getDoubleValue() {
		return super.getDoubleValue();
	}
}
