package java_20200526;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		
		try {
			fis = new FileInputStream("");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("");
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos,true);//true => autoFlush
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		
		int readByte = 0;
		try {
			while((readByte = bis.read()) != -1) {
				ps.print(readByte);
				ps.write(readByte);
}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

}

}	
	
}
