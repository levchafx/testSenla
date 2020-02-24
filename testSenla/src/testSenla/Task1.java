package testSenla;

import java.math.BigInteger;
import java.util.Scanner;

public class Task1 {
	private static final String EVEN = "even";
	private static final String ODD = "odd";
	private static final String PRIME = "prime";
	private static final String COMPOSITE = "composite";

	public static String isEvenOrOdd(int i) {
		if (i % 2 == 0) {
			return EVEN;
		}
		return ODD;
	}

	public static String isPrimeOrComposite(int i) {
		BigInteger j = BigInteger.valueOf(i);
		if (j.isProbablePrime((int) Math.log(i))) {
			return PRIME;
		}
		return COMPOSITE;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.print("please enter number: ");
		if (sc.hasNextInt()) {
			i = sc.nextInt();

			System.out.println("Number " + i + " is " + isEvenOrOdd(i));
			System.out.println("Number " + i + " is " + isPrimeOrComposite(i));

		} else {
			System.out.println("please enter correct number");
		}
		sc.close();
	}

}
