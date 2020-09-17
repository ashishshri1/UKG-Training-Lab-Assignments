package lab3.q6;

import java.util.*;

class InputException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InputException(int n) {
		super("Number can't be greater than " + n);
	}
}

public class OddEvenWithCustomRangeException {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter maximum value for integer input: ");
			int max = sc.nextInt();
			while (true) {
				try {
					System.out.println("Please enter a number or enter '-1' if you want to quit");
					int n = sc.nextInt();
					if (n == -1)
						break;
					else if (n > 100)
						throw new InputException(max);
					else if (n % 2 != 0)
						System.out.println("You have entered an odd number");
					else
						System.out.println("You have entered an even integer");
				} catch (InputMismatchException e) {
					System.out.println("You must enter an integer.");
					sc.next();
				} catch (InputException e) {
					System.out.println(e.getMessage());
				}
			}
		}

	}
}
