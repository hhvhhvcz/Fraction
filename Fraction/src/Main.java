/**
 * 
 */

/**
 * @author Hahaw
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fraction f1 = new Fraction(20,40);
		Fraction f2 = new Fraction(8,32);
		
		System.out.println(f1);
		System.out.println(f2);
		
		Fraction add = Fraction.fractionAddition(f1, f2);
		Fraction sub = Fraction.fractionSubtraction(f1, f2);
		Fraction mul = Fraction.fractionMultiplication(f1, f2);
		Fraction div = Fraction.fractionDivision(f1, f2);
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
	}

}
