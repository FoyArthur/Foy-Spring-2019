//@author: Arthur Foy
//@date: 3/29/2019
package textExcel;

//cell that has something entered into it
public class RealCell implements Cell{
	private String userInput;

	public RealCell(String input) {
		userInput = input;
	}
	
	//returns what user originally entered
	public String fullCellText() {
		return userInput;
	}
	
	//returns userInput abbreviated to a String of length 10
	public String abbreviatedCellText() {
			String abbrev = getDoubleValue() + "          ";
			return(abbrev.substring(0, 10));
	}
	
	//converts userInput to Double
	public double getDoubleValue() {
		return Double.parseDouble(userInput);
	}
}