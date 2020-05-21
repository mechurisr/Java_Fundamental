package study;

public class Dummy {
	public static void main(String[] args) {
		String[] subject = new String[3];
		
		subject[0] = "국어";
		subject[1] = "영어";
		subject[2] = "수학";
		
		for(int i = 0; i < subject.length; i++) {
			System.out.println(subject[i]);
		}
		for(String value : subject) {
			System.out.println(value);
		}
	}

}
