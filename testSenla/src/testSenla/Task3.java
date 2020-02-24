package testSenla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		String s = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("please type in your sentence");
		if (sc.hasNextLine()) {
			s = sc.nextLine();
			if (!s.isEmpty()) {
				List<String> words = Arrays.asList(s.split(" "));
				System.out.println("There are " + words.size() + " words in sentence");
				Collections.sort(words);
				for (String str : words) {
					str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
					System.out.println(str);
				}
			} else {
				System.out.println("your sentence is empty");
			}
		}
		sc.close();
	}
}
