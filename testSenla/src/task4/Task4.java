package task4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task4 {
	public static int countWords(String s, String s1) {
		int counter = 0;
		List<String> words = Arrays.asList(s.split(" "));
		for (String word : words) {
			if (word.equalsIgnoreCase(s1)) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		String sentence = null;
		String wordToLookFor = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("please type in your sentence");
		if (sc.hasNextLine()) {
			sentence = sc.nextLine();
			System.out.println("please type in the word you want to count");
			if (sc.hasNextLine()) {
				wordToLookFor = sc.nextLine();
				System.out.println("there are " + countWords(sentence, wordToLookFor) + " occasions found");
			}
		} else {
			System.out.println("information provided is incorrect");
		}
		sc.close();
	}
}
