package practiceNote;

public class WhilePrac {
	public static void main(String[] args) {
	/*	int i = 2;
		while (i <= 9) {
			int j = 1;
			while (j <= 9) {
				System.out.printf("%d * %d = %d%n", i, j, i * j);
				j++;
			}
			i++;
		} */

		for (int i = 2; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %d%n", i, j, i * j);
			}
		}

	}
}
