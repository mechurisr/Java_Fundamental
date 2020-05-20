package study;

public class Java2 {
	public static void main(String[] args) {
		String season = null;
		int month = 7;
		if (month == 12 || month == 1 || month == 2) {
			season = "겨울";
		} else if (month == 3 || month == 4 || month == 5) {
			season = "봄";
		} else if (month == 6 || month == 7 || month == 8) {
			season = "여름";
		} else if (month == 9 || month == 10 || month == 11) {
			season = "가을";
		} else {
			season = "없는계절";
		}
		System.out.println(month + "월은 " + season + "입니다.");
		// %d => 정수형, %f => 실수형, %s => String, %n => 개행(printf에만 가능)
		System.out.printf("%d월은 %s입니다. %n", month, season);
		System.out.println("test");
		
		//month => char, byte, short, int, String
		switch(month) {
		case 12 : season = "겨울"; break;
		case 1 : season = "겨울"; break;
		case 2 : season = "겨울"; break;
		case 3 : season = "봄;"; break;
		case 4 : season = "봄"; break;
		case 5 : season = "봄"; break;
		case 6 : season = "여름"; break;
		case 7 : season = "여름"; break;
		case 8 : season = "여름"; break;
		case 9 : season = "가을"; break;
		case 10 : season = "가을"; break;
		case 11 : season = "가을"; break;
		default : season = "없는계절";
		}
		
		System.out.printf("%d월은 %s입니다%n", month, season);
		
		int sum = 0;
		//i = 1(초기값을 바깥에 뺄 수 있다)
		for(int i = 1; i <= 100; i++) {
			if(i%2==0) {
				sum += i; //sum = sum + i
		}
		}
		System.out.printf("1부터 100까지 합은 %d입니다.",sum);
		/*
		 * i = 1, sum = 1 
		 * i = 2, sum = 3
		 * i = 3, sum = 6
		 * i = 4, sum = 10
		 * i = 5, sum = 15
		 * i = 6, sum = 21
		 * i = 7, sum = 28
		 * i = 8, sum = 36
		 * i = 9, sum = 45
		 * i = 10, sum = 55
		 * i = 11
		 */
		
		for(int i=2;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.printf("%d*%d=%d%n", i, j, i*j);
			}
		}
		
		for(int i=9;i>=2;i--) {
			for (int j=2;j<=9;j++) {
				System.out.printf("%d*%d=%d%n", i, j, i*j);
			}
		}
		/*
		 * i = 2, j = 1 => 2 * 1 = 2
		 *		, j = 2 => 2 * 2 = 4 
		 * 		, j = 3 => 2 * 3 = 6
		 * 		, ...
		 * 		, j = 9 => 2 * 9 = 18
		 * i = 3, j = 1 => 3 * 1 = 3
		 * 
		 * 
		 * 
		 * 
		 */
		int i = 1;
		sum = 0;
		while(i <= 10) {
			if(i%2==0) {
			sum =+ i;
			i++;
		}
		}
		System.out.printf("1부터 10까지 합은 %d 입니다.%n", sum);
		
		
		i = 2;
		while(i<=9) {
			int j = 1;
			while(j<=9) {
				System.out.printf("%d*%d=%d%n", i, j, i*j);
				j++;
			}
			i++;
		}
		
		
		
		
		
		
		
		
	}
}
