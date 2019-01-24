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
	}
}
