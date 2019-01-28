package fracCalc;
import java.util.*;

public class Fraction {
	int numerator;
	int whole;
	int denominator;
	public Fraction(String operand) {
		if(operand.indexOf("_") != -1) {
			whole = Integer.parseInt(operand.substring(0, operand.indexOf("_")));
		}else {
			whole = 0;
		}if(operand.indexOf("_") != -1 && operand.indexOf("/") != -1) {
			numerator = Integer.parseInt(operand.substring(operand.indexOf("_"), operand.indexOf("/")));
			denominator = Integer.parseInt(operand.substring(operand.indexOf("/") + 1));
		}else if(operand.indexOf("/")!= -1) {
        	numerator = Integer.parseInt(operand.substring(0, operand.indexOf("/")));
        	denominator = Integer.parseInt(operand.substring(operand.indexOf("/") + 1));
        }else {
        	numerator = 0;
        	denominator = 1;		
        }
		toImproperFrac();
	}
	
	public Fraction() {
		numerator = 0;
		denominator = 1;
		whole = 0;
	}
	
	public void toImproperFrac() {
		numerator = denominator * whole + numerator;
	}
	
	public Fraction doMath(String operator, Fraction operand) {
		Fraction solution = new Fraction();
		if(operator.equals("+")) {
			solution.numerator = numerator * operand.denominator + denominator * operand.numerator;
			solution.denominator *= operand.numerator;
		}else if(operator.equals("-")) {
			solution.numerator = numerator * operand.denominator - denominator * operand.numerator;
			solution.denominator *= operand.numerator;
		}else if(operator.equals("*")) {
			solution.numerator *= operand.numerator;
			solution.denominator *= operand.denominator;
		}else if(operator.equals("/")) {
			solution.numerator *= operand.denominator;
			solution.denominator *= operand.numerator;
		}
		return solution;
	}
	
	public void toMixedNum() {
		int gcf = 0;
		if(numerator < 0 && denominator < 0) {
    		numerator *= -1;
    		denominator *= -1;
    	}
		if(absValue(numerator) > absValue(denominator)){
    		whole = numerator/denominator;
    		numerator = numerator - (whole * denominator);
    		if(numerator < 0) {
    			numerator *= -1;
    		}
    		if(denominator < 0) {
    			denominator *= -1;
    		}
    		gcf = gcf(numerator, denominator);
    		numerator = (numerator/gcf);
    		denominator = (denominator/gcf);
		}else {
			gcf = gcf(absValue(numerator), absValue(denominator));
    		numerator = numerator/gcf;
    		denominator = denominator/gcf;
    		if(denominator < 0) {
    			denominator *= -1;
    			numerator *= -1;
    		}
		}
	}
	
	public String toString() {
		String finalString = null;
		if(whole == 0) {
			if(denominator == 0) {
				finalString = (0 + "");
			}else if(denominator == 1) {
	    		finalString = (numerator + "");
	    	}else if(numerator == denominator) {
	    		finalString = 1 + "";
	    	}else {
	    		finalString = (numerator + "/" + denominator);
	    	}
		}
		if(numerator == 0) {
			finalString = (whole + "");
		}else {
			finalString = (whole + "_" + numerator + "/" + denominator);
		}
		return finalString;
	}
	
	public int absValue(int number) {
		if(number < 0) {
			return number * -1;
		}else {
			return number;
		}
	}
	
	public int gcf(int num1, int num2){
		int gcFactor = 1;
		for(int i = 2; i <= min(num1, num2); i++) {
			if(isDivisibleBy(num1, i) == true && isDivisibleBy(num2, i) == true){
				gcFactor = i;
			}
		}
		return gcFactor;
	}
	
	public boolean isDivisibleBy(int num1, int num2) {
		if(num2 == 0) throw new IllegalArgumentException ("The second number cannot be zero");
		if(num1 % num2 == 0 || num2 % num1 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int min(int num1, int num2){
		if(num1 <= num2){
			return num1;
		} else{
			return num2;
		}
	}
	
	
}
