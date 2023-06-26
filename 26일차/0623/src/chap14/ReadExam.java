package chap14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExam {

	public static void main(String[] args) throws IOException {

		InputStream is = new FileInputStream("C:/Temp/test1.db");

		byte[] buffer = new byte[100];
		
		
		while (true) {

			int data = is.read(buffer);
			if (data == -1)
				break;
			for(int i = 0; i<data; i++) {
				System.out.println(buffer[i]);
			}
		}

		is.close();
	}

}
