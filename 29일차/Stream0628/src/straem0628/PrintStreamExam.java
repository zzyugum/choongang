package straem0628;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExam {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Temp\\printstream.txt");
		if(file.exists()) {
			System.out.println("있다");
		} else {
			System.out.println("없다");
		}
		FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);

		ps.println("[프린트 보조 스트림]");
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼");
		ps.println("데이터를 출력합니다");
		ps.flush();
		ps.close();

	}

}
