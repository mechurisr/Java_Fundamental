package java_20200526;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("c:\\dev\\jre-8u251-windows-x64.exe");
			fos = new FileOutputStream("c:\\dev\\jre2.exe");

			int readByteCount = 0;
			byte[] readBytes = new byte[1024 * 8];

			// fis.read(readByte) : FileInputStream에 8192 바이트를 읽어서 readBytes에 저장하고 읽은 바이트수를
			// 반환한다.

			while ((readByteCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0, readByteCount);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
	}
}
