package java_20200511;

public class CharacterDemo {
	public static void main(String[] args) {
		//1 유니코드
		char c1 = '\uC774';
		char c2 = '\uCC2C';
		char c3 = '\uC6B1';
		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3);
		
		//2 아스키코드 표현
		// 48 - 57 => 0-9
		// 65 - 90 => A-Z
		// 97 - 122 => a-z
		char c4 = 97;
		System.out.println(c4);
		
		//3. 문자 표현법
		char c5 = '성';
		System.out.println(c5);
		
		// ',",\ 는 외우기 귀찮으니 다 앞에 \를 붙이자
		char c6 = '\"';
		String s1 = "\\";
		System.out.println(c6);
		System.out.println(s1);
		
		System.out.println("aa"+'\t'+"bb");
		System.out.println("aa"+'\n'+"bb");
		System.out.println("aa"+'\r'+"bb");
		
	
	}

}
