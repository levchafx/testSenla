package task2;

import java.util.Scanner;

public class Task2 {
	// least common multiple
	public static int lcm(int i, int j) {
		return i / gcd(i, j) * j;
	}

	// greatest common divisor
	public static int gcd(int i, int j) {
		return j == 0 ? i : gcd(j, i % j);

	}

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter 2 numbers:");
		if (sc.hasNextInt()) {
			i = sc.nextInt();
			j = sc.nextInt();
			System.out.println("Least common multiple for " + i + ", " + j + " is " + lcm(i, j));
			System.out.println("Greatest common divisor for " + i + ", " + j + " is " + gcd(i, j));
		} else {
			System.out.println("please enter correct numbers");
		}
		sc.close();
	}
}
