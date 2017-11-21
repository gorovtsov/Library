package by.htp.library.view.impl;

import java.util.Scanner;

public class ConsoleInput {
	public String stringInput() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String result = "";
		if (sc.hasNextLine()) {
			result = sc.nextLine();
		}
		return result;
	}

	public int intInput() {
		int result = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		do {
			if (sc.hasNextInt()) {
				result = sc.nextInt();
			} else {
				System.out.println("¬ведите целое число: ");
				continue;
			}
		} while (!(sc.hasNext()));
		return result;
	}
}
