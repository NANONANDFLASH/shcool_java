package j0413;

public class Exam2 {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			System.out.println("1234");
		}
		System.out.println("");

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("");

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		System.out.println("");

		for (int i = 3; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");

		for (int i = 3; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		System.out.println("");

		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
