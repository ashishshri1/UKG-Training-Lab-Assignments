package lab3.q7;

import java.io.*;

class InputException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InputException(int n) {
		super("Number can't be greater than " + n);
	}
}

public class ExceptionThrowingMethod {
	public static void throwException() throws InputException, IOException {
	}

	public static void main(String[] args) {
		// Compiler suggested to use add throws declaration, surround method with
		// try-catch
		// After that 2 catch blocks have been added to handle both the exceptions that
		// can be thrown from method throwException()
		try {
			throwException();
		} catch (InputException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
