package lab1.q5;

public class Pattern {
	public static void main(String[] args) {
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}
}
