package study_202005;

public class Java1 {
	public static void main(String[] args) {
		// 식별자 - 클래스명, 변수명, 메서드명, 패키지이름

		int a1 = 10;
		int a_1 = 10;
		int $1 = 10;
		int fatherAge = 50;
		int fatherage = 50; // 다른 단어(대소문자 구분)
		// 숫자로 시작하면 안됨
		// int 1a = 10
		// 특수문자는 사용불가(예외: $,_)
		// int a# = 20;

		// 공백을 허용하지 않음
		// int father Age = 10;

		// 예약어는 사용할 수 없음.
		// int break = 10;

		byte b1 = (byte) 128;
		System.out.println(b1);// 캐스팅 하면 서킷 발생

		// 10진수 표현법
		byte b2 = 10;

		// 8진수 표현법
		byte b3 = 012;

		// 2진수 표현법
		byte b4 = 0b1010;

		// 16진수 표현법
		short b5 = 0x12f2; // f가 15로 최대

		long l1 = 2_200_000_000l;

		float f1 = 12.45f;

		double d1 = 12.45d;// d는 생략가능

		// 문자 표현법
		char c1 = 'a';

		// 아스키코드 표현법
		char c2 = 97;// = 'a'

		// 유니코드 표현법
		char c3 = '\uc131';// = '성'

		// casting 했을경우 cut 발생
		int e2 = (int) 1234.56;

		int e3 = 10;
		System.out.println(e3);

		int e4 = e3++; // 대입 후 증가
		System.out.println(e4);

		int e5 = ++e3; // 증가 후 대입
		System.out.println(e5);
		
		int e6 = 10;
		double e7 = 10.0;
		System.out.println(e6==e7);

		// a && b => a => false 일때 short circuit 발생
		// a || b => a => true 일때 short circuit 발생
		
		System.out.println(1+2+3+"abcd");//가운데 +는 연결연산자가 됨
		
		System.out.println("abcd"+(1+2+3));//우선순위 최고자는 ()
		
	}
}
