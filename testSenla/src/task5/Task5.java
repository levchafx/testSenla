package task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.naming.directory.InvalidAttributesException;

public class Task5 {
	private static final int MAX = 100;

	public static void main(String[] args) throws InvalidAttributesException {
		Integer i = 0;
		List<Integer> numbers = new ArrayList<>(
				Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99));
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your number");
		if (sc.hasNextInt()) {
			i = sc.nextInt();
			if (i > MAX) {
				extracted();
			}
			for (int j = 0; j <= i; j++) {
				if (numbers.contains(j)) {
					System.out.println(j);
				}
			}
		} else {
			System.out.println("invalid input");
		}
		sc.close();
	}

	private static void extracted() throws InvalidAttributesException {
		throw new InvalidAttributesException("number cannot be larger than 100");
	}
}
