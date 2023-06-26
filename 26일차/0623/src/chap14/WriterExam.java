package chap14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriterExam {

	public static void main(String[] args) throws IOException {

		OutputStream os = new FileOutputStream("C:/Temp/test1.db");
//
//		byte a = 10;
//		byte b = 20;
//		byte c = 30;		
//		os.write(a);
//		os.write(b);
//		os.write(c);
		
		
		byte[] a = {110,-1,30, 40, 50};
		
		os.write(a, 1, 3);

		os.flush();
		os.close();
	}

}
