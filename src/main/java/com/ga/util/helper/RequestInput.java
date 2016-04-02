/**
 *   File Name: RequestInput.java<br>
 *
 *   Gajula, jayabhanu<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 30, 2016
 *
 */

package com.ga.util.helper;

import java.util.*;

/**
 * RequestInput //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class RequestInput {
	private static String[] acceptableNumber;
	private static Scanner scanner;

	// Get a char value from the user
	public static char getChar(String question) {
		return 0;

	}

	// Get a char value from the user, must be an acceptable value
	public static char getChar(String question, char... acceptWord) {
		int count = 0;
		System.out.println(question);
		String inputword = scanner.nextLine();
		for (int i = 0; i <= inputword.length(); i++) {
			if (acceptWord[i] == 'a' || acceptWord[i] == 'e' || acceptWord[i] == 'i' || acceptWord[i] == 'o'
					|| acceptWord[i] == 'u') {
				count++;
			}
		}
		System.out.println("They are:" + count + "owvals in this word");
		return 'r';

	}

	// Get a double value from the user
	public static double getDouble(String question) {
		return 0;

	}

	// Get a int from the user, must be in acceptable range value
	public static int getInt(String question, int... acceptableNumber) {
		int resultValue;
		// System.out.println(resultValue);
		String input = null;
		boolean validInt = false;
		scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.println(question);
				input = scanner.nextLine();
				resultValue = Integer.parseInt(input);
				// System.out.println(resultValue);
				for (int i = 0; i < acceptableNumber.length; i++) {
					if (resultValue == acceptableNumber[i]) {
						validInt = true;
					}
				}
				if (!validInt) {

					throw new InvalidAcceptableNumberException();
				}
				return resultValue;

				// scanner.close();
				// return resultValue;
			} catch (NumberFormatException e) {
				System.out.println("You have nott provided a valid type (" + input + ")");

			} catch (InvalidAcceptableNumberException e) {
				System.out.println("You have not an acceptable number (" + input + ")");
			}
		}
	}

	public static String getString(String question) {
		// Local variable to hold temporary number
		String input;
		// Ask the user a question to get relative input
		System.out.print(question);
		// Set the number based on what the user enters on their
		// keyboard
		scanner = new Scanner(System.in);
		input = scanner.nextLine();
		// Return input user has entered
		return input;
	}

	// Get a String from the user, must be an acceptable value
	public static String getString(String question, String... acceptableWords) {
		String resultValue;
		String input = null;
		boolean validWord = false;
		scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.println(question);
				input = scanner.nextLine();
				resultValue = input;
				for (int i = 0; i < acceptableWords.length; i++) {
					// just play around instead of trim(), toUppercase(),and
					// trim().replace(" ", "").equals()
					if (resultValue.trim().replace(" ", "").equalsIgnoreCase(acceptableWords[i])) {
						validWord = true;
					}
				}
				if (!validWord) {

					throw new InvalidAcceptableWordException();
				}
				return resultValue;

				// scanner.close();
				// return resultValue;
			} catch (InvalidAcceptableWordException e) {
				System.out.println("You have not an acceptable word (" + input + ")");
			}
		}
	}

	// }
	// String input;
	// String resultValue;
	// scanner = new Scanner(System.in);
	// System.out.print(question);
	// input = scanner.nextLine();
	// resultValue = input;
	// return resultValue;
	//
	// }

	// Create your own helper method that you may find useful

}
