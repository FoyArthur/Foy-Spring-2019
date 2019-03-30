//@author ArthurFoy
//@date 3/29/2019
package textExcel;

//this cell is for formulas which are entered through parentheses
public class FormulaCell extends RealCell{
	String userInput;
	//constructor
	public FormulaCell(String input) {
		super(input);
		userInput = input;
	}
	
	//returns string of length 10
	public String abbreviatedCellText() {
		return super.abbreviatedCellText();
	}
	
	//returns original Formula that user entered, when inspected
	public String fullCellText() {
		return super.fullCellText();
	}
	
	//returns a double of operation from left to right
	public double getDoubleValue() {
		String[] arr = userInput.split(" ");
		if(arr.length > 4) {
			double answer = operate(arr[1], arr[2], arr[3]);
			for(int i = 4; i < arr.length - 1; i+=2) {
				if((arr[i]).equals("+")) {
					answer += Double.parseDouble(arr[i+1]);
				}else if(arr[i].equals("-")) {
					answer -= Double.parseDouble(arr[i+1]);
				}else if(arr[i].equals("*")) {
					answer *= Double.parseDouble(arr[i+1]);
				}else {
					answer /= Double.parseDouble(arr[i+1]);
				}
			}
			return answer;
		}else {
			return Double.parseDouble(arr[1]);
		}
	}
	public double operate(String num1, String operator, String num2) {
		if(operator.equals("+")) {
			return(Double.parseDouble(num1) + Double.parseDouble(num2));
		}else if(operator.equals("-")) {
			return(Double.parseDouble(num1) - Double.parseDouble(num2));
		}else if(operator.equals("/")) {
			return(Double.parseDouble(num1) / Double.parseDouble(num2));
		}else {
			return(Double.parseDouble(num1) * Double.parseDouble(num2));
		}
	}
}
