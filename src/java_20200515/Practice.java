package java_20200515;

public class Practice {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 12; i++) {
			if(i == 7)
				continue;
			sum += i;
		}
		System.out.printf("1부터 12까지의 합은 %d이다. (단 7은 제외)" , sum);
	}
}
