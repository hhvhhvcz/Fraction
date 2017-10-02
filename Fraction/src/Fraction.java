/**
 * 
 */

/**
 * @author Hahaw
 *	
 *	Fraction class
 *
 *	This class can store value of numerator and denominator and do basic Math operations with it. (+,-,*,/)
 */
public class Fraction {
	
	private int numerator;
	private int denominator;
	
	/**
	 * full constructor
	 * @param numerator - value of numerator
	 * @param denominator value of denominator
	 */
	public Fraction(int numerator, int denominator) {
		if (denominator == 0) {
			System.out.println("Jmenovatel nemuze byt nula!");
			return;
		}
		this.numerator = numerator;
		this.denominator = denominator;
		this.greatestDivider();
	}
	/**
	 * empty constructor
	 */
	public Fraction() {
		numerator = 1;
		denominator = 1;
	}
	
	/**
	 * method which shortens the fraction
	 */
	public void greatestDivider() {
		if(denominator == 0) {
			throw new java.lang.ArithmeticException("/ by zero");
		}
		int a = numerator;
		int b = denominator;
		int divider = 0;
		while(a!=0 && b!=0) {
			divider = b;
	        b = a%b;
	        a = divider;
	    }
	    divider = a + b;
	    
	    numerator =  numerator / divider;
	    denominator /= divider;
		
	}
	/**
	 * Method for adding two fraction
	 * @param no1 - first fraction in operation
	 * @param no2 - second fraction in operation
	 * @return new fraction object after operation
	 */
	public static Fraction fractionAddition(Fraction no1, Fraction no2){
		int num = no1.numerator * no2.denominator + no2.numerator * no1.denominator;
		int denum = no1.denominator * no2.denominator;
		return new Fraction(num, denum);
	}
	/**
	 * Method for subtracting two fraction
	 * @param no1 - first fraction in operation
	 * @param no2 - second fraction in operation
	 * @return  new fraction object after operation
	 */
	public static Fraction fractionSubtraction(Fraction no1, Fraction no2){
		int num = no1.numerator * no2.denominator - no2.numerator * no1.denominator;
		int denum = no1.denominator * no2.denominator;
		return new Fraction(num, denum);
	}
	/**
	 * Method for multiplying two fraction
	 * @param no1 - first fraction in operation
	 * @param no2 - second fraction in operation
	 * @return  new fraction object after operation
	 */
	public static Fraction fractionMultiplication(Fraction no1, Fraction no2){
		int num = no1.numerator * no2.numerator;
		int denum = no1.denominator * no2.denominator;
		return new Fraction(num, denum);
	}
	/**
	 * Method for dividing two fraction
	 * @param no1 - first fraction in operation
	 * @param no2 - second fraction in operation
	 * @return  new fraction object after operation
	 */
	public static Fraction fractionDivision(Fraction no1, Fraction no2){
		int num = no1.numerator * no2.denominator;
		int denum = no1.denominator * no2.numerator;
		return new Fraction(num, denum);
	}
	/**
	 * To string for writting the data in fraction to console
	 */
	public String toString() {
		return "["+ numerator + "/" + denominator + "]";
	}
}
