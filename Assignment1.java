/**
 * 
 */
package sdh.java.session1;

import java.util.Scanner;

/**
 * @author sudhi
 * 
 */
public class Assignment1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number: ");
		try {
			int a = in.nextInt();
			System.out.println("Enter second number: ");
			float b = in.nextFloat();
			float c = a + b;
			System.out.println("Sum of 2 numbers is : " + c);
		} catch (NumberFormatException e) {
			System.out.println("Invalid Input.");
		}
	}

}
