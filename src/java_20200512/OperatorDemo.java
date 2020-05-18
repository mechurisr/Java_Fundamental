package java_20200512;
//ctrl + shift + f => 자동으로 줄 맞춰주기
public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10, b = 22;
		int c = 0;
		double d = 0;

		c = a + b;
		System.out.println(c);

		c = a - b;
		System.out.println(c);

		d = (double)b / a;
		System.out.println(d);
		//int끼리 나누면 소수점 표현 불가능(auto-casting)
		//한쪽만 casting하면 다른쪽도 casting됨
		
		c = a * b;
		System.out.println(c);
		
		//나머지 연산자(자주 사용)
		c = b % a;
		System.out.println(c);
		
		a += b;// a = a + b
		System.out.println(a);
		
		int sum = 0;
		for(int i=1;i<=100;i++) {
			sum += i;
		}
		System.out.println(sum);
		
		a = 10;
		b = 20;
		d = 20.0;
		
		a++; // a = a+1
		++b; // b = b+1;
		
		System.out.println(a);//11
		System.out.println(b);//21
		
		//대입 후 증가
		c = a++;// c => 11
		System.out.println(c);
		
		//증가 후 대입
		c = ++b; //c = >22 
		System.out.println(c);
		
		a = 10;
		b = 20;
		d = 20.0;
		
		boolean isSuccess = false;
		isSuccess = a > b;
		System.out.println(isSuccess);
		
		isSuccess = a < b;
		System.out.println(isSuccess);
		
		isSuccess = a >= b;
		System.out.println(isSuccess);
		
		isSuccess = d <= b;
		System.out.println(isSuccess);
		//primitive data type의 == 연산자는 자료형에 상관없이 값만 같으면
		//true를 반환한다.
		isSuccess = b == d;
		System.out.println(isSuccess);
		
		isSuccess = a != b;
		System.out.println(isSuccess);
		
		System.out.println( 4 & 5 ); //0100 AND 0101 = 0100
		System.out.println( 4 | 5 ); //0100 OR 0101 = 0101
		System.out.println( 4 ^ 5 ); //0100 XOR 0101 = 0001
		
		a = 10;
		b = 20;
		
		//a && b => a가 false이면 b를 연산하지 않음(short circuit)
		//a || b => a가 true이면 b를 연산하지 않음(short circuit)
		
		isSuccess = (a==b) && (++a==b++);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		
		// + =>연결연산자(두개중 1개 이상이 문자열일 경우)
		//, 산술연산자(두개 모두 숫자일경우)
		
		System.out.println(1+2+3+"456");
		System.out.println("123"+4+5+6);
	}

}
