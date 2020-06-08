package practiceNote;

public class StringMethodPrac {
	public static void main(String[] args) {
		String ssn = "123456-7890123";
		char c = ssn.charAt(9);
		System.out.println(c);
		
		String ssd = ssn.concat("abcd");
		System.out.println(ssd);
		
		String fileName = "adcd.png";
		if(fileName.endsWith("doc")) {
			System.out.println("워드문서임");
		}else if(fileName.endsWith("zip")) {
			System.out.println("압축파일임.");
		}else {
			System.out.println("함튼 파일임.");
		}
		fileName = "abc.abc.abc.abc.doc";
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.lastIndexOf("."));
		
	}

}
