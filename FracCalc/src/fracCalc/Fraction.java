package fracCalc;
import java.util.*;

public class Fraction {
	int numerator;
	int whole;
	int denominator;
	
	//constructor for when a String  is passed in
	public Fraction(String operand) {
		int indexOfUnderscore = operand.indexOf("_");
		int indexOfForwardSlash = operand.indexOf("/");
		if(indexOfUnderscore != -1 && indexOfForwardSlash != -1) {
			whole = Integer.parseInt(operand.substring(0, indexOfUnderscore));
			numerator = Integer.parseInt(operand.substring(indexOfUnderscore + 1, indexOfForwardSlash));
			denominator = Integer.parseInt(operand.substring(indexOfForwardSlash + 1));
		}else if(operand.indexOf("/")!= -1) {
        	numerator = Integer.parseInt(operand.substring(0, indexOfForwardSlash));
        	denominator = Integer.parseInt(operand.substring(indexOfForwardSlash + 1));
        	whole = 0;
        }else {
        	whole = Integer.parseInt(operand);
        	numerator = 0;
        	denominator = 1;		
        }
			toImproperFrac();
	}
	
	//constructor when no string is passed in
	public Fraction() {
		numerator = 0;
		denominator = 1;
		whole = 0;
	}
	
	//changes fraction to improper fraction
	public void toImproperFrac() {
		if(whole >= 0) {
			numerator = denominator * whole + numerator;
		}else {
			numerator = denominator * whole - numerator;
		}
		whole = 0;
	}
	
	//adds, subtracts, multiplies, or divides two fractions
	public Fraction doMath(String operator, Fraction operand) {
		Fraction solution = new Fraction();
		solution.denominator = denominator * operand.denominator;
		if(operator.equals("+")) {
			solution.numerator = numerator * operand.denominator + denominator * operand.numerator;
		}else if(operator.equals("-")) {
			solution.numerator = numerator * operand.denominator - denominator * operand.numerator;
		}else if(operator.equals("*")) {
			solution.numerator = numerator * operand.numerator;
		}else if(operator.equals("/")) {
			solution.numerator = numerator * operand.denominator;
			solution.denominator = denominator * operand.numerator;
		}
		return solution;
	}
	
	//changes fraction to mixed number
	public void toMixedNum() {
		int gcf = gcf(absValue(numerator), absValue(denominator));
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
		}else if(denominator < 0) {
    			denominator *= -1;
    			numerator *= -1;
    		}
		numerator = (numerator/gcf);
		denominator = (denominator/gcf);
	}
	
	//changes a fraction to a string
	public String toString() {
		String finalString = null;
		if(whole == 0) {
			if(denominator == 0 || numerator == 0) {
				finalString = (0 + "");
			}else if(denominator == 1) {
	    		finalString = (numerator + "");
	    	}else if(numerator == denominator) {
	    		finalString = 1 + "";
	    	}else {
	    		finalString = (numerator + "/" + denominator);
	    	}
		}else if(numerator == 0 && whole != 0) {
			finalString = (whole + "");
		}else {
			finalString = (whole + "_" + numerator + "/" + denominator);
		}
		return finalString;
	}
	
	//returns absolute value
	public int absValue(int number) {
		if(number < 0) {
			return number * -1;
		}else {
			return number;
		}
	}
	
	//returns greatest common factor of two numbers
	public int gcf(int num1, int num2){
		int gcFactor = 1;
		for(int i = 2; i <= min(num1, num2); i++) {
			if(isDivisibleBy(num1, i) == true && isDivisibleBy(num2, i) == true){
				gcFactor = i;
			}
		}
		return gcFactor;
	}
	
	//returns if either of two numbers is divisible by the other 
	public boolean isDivisibleBy(int num1, int num2) {
		if(num2 == 0) throw new IllegalArgumentException ("The second number cannot be zero");
		if(num1 % num2 == 0 || num2 % num1 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	//returns the smallest of two numbers 
	public static int min(int num1, int num2){
		if(num1 <= num2){
			return num1;
		} else{
			return num2;
		}
	}
	

}
