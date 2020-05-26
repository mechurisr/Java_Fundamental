package practiceNote;

import java.io.File;

public class FilePrac {
	public static void main(String[] args) {
		File f1 = new File("c:\\dev\\2020\\05\\25");
		boolean success = f1.mkdirs();
		if (success ) {
			System.out.println("해냈습니다.");
		} else {
			System.out.println("안되네요...");
		}
	
	}
}
