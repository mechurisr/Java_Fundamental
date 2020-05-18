package java_20200513;

public class Practice {
	public static void main(String[] args) {
		int sum = 0;
	for(int i = 1; i <= 10; i++) {
		if(i==6) break;
		sum += i;
	}
		System.out.printf("1부터 6까지 합은 %d입니다.%n", sum);
	
	sum = 0;
	int i = 1;
	while(i <= 10) {
		sum += i;
		i++;
	}
	System.out.printf("1부터 10까지 합은 %d입니다%n", sum);
	}
}
