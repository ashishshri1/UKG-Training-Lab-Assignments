package lab1.q1;

public class Fibonacci {
	public static void main(String[] args) {
		double avg = 0;
		System.out.println("The first 20 fibonacci numbers are: ");
		int f1 = 1;
		int f2 = 1;
		avg = f1 + f2;
		System.out.print(f1 + " " + f2 + " ");
		for (int i = 0; i < 18; i++) {
			System.out.print((f1 + f2) + " ");
			int temp = f2;
			f2 = f1 + f2;
			f1 = temp;
			avg += f2;
		}
		System.out.println("");
		avg = avg / 20.0;
		System.out.println("The average is " + avg);
	}
}
