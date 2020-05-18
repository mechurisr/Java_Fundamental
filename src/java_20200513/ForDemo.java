package java_20200513;

public class ForDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;// sum = sum + i
		}
		System.out.printf("1부터 10까지 합은 %d 입니다.", sum);

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.printf("1부터 10까지 짝수 합은 %d 입니다.%n", sum);

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d%n", i, j, i * j);
			}
		}

		// 9,8,7,,,2단
		for (int i = 9; i >= 2; i--) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d%n", i, j, i * j);
			}
		}
		/*
		 
		 * 
		 **
		 ***
		 ****
		 *****
		  
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 5; i > 0; i--) { // i가 0보다 크면 i카운트를 내리고 다음단계로 진행
			for (int j = 0; j < i; j++) { // *을 찍고 j카운트를 올리는 역할)i와 같아지면 다음 단계로 진행
				System.out.print("*");
			}
			System.out.println();

		}
		/*
		  
		     * 
		    ** 
		   ***
		  ****
		 ***** 
		 */
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");

		}
		for (int i = 0; i <5; i++) {
			for (int j = 0; j< i ; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 5-i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
