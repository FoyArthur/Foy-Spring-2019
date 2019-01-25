package fracCalc;

public class Fraction {
	private int numerator;
	private int denominator;
	private int whole;
	public Fraction(String operand) {
		if(operand.indexOf("_") != -1) {
			whole = Integer.parseInt(operand.substring(0, operand.indexOf("_")));
		}else {
			whole = 0;
		}
		if(operand.indexOf("/") != -1 && operand.indexOf("_") != -1){
			numerator = Integer.parseInt(operand.substring(operand.indexOf("_") + 1, operand.indexOf("/")));
			denominator = Integer.parseInt(operand.substring(operand.indexOf("/") + 1));
		}else if(operand.indexOf("/") != -1) {
			numerator = Integer.parseInt(operand.substring(0, operand.indexOf("/")));
			denominator = Integer.parseInt(operand.substring(operand.indexOf("/") + 1));
		}else {
			numerator = 0;
			denominator = 1;
		}
		toImproperFraction();
	}
	
	public Fraction() {
		whole = 0;
		numerator = 0;
		denominator = 1;
	}
	
	public void toImproperFraction() {
		numerator = denominator * whole + numerator;
	}
	public void doMath(String operator, Fraction fraction) {
		if(operator.equals("+")) {
			numerator = (numerator * fraction.denominator) + (fraction.numerator * denominator);
			denominator = denominator * fraction.denominator;
		}else if(operator.equals("-")) {
			numerator = (numerator * fraction.denominator) - (fraction.numerator * denominator);
			denominator = denominator * fraction.denominator;
		}else if()
	}
}
