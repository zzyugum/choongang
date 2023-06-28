package straem0628;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectStreamExam {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		writeList();
		List<Board> list = readList();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (Board board : list) {
			System.out.println(

					board.getBno() + "\t" + board.getTitle() + "\t" + board.getContent() + "\t" + board.getWriter()
							+ "\t" + sdf.format(board.getDate()));
		}
	}

	public static void writeList() throws IOException {
		List<Board> list = new ArrayList<>();

		list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date()));
		list.add(new Board(2, "제목2", "내용2", "글쓴이3", new Date()));
		list.add(new Board(3, "제목3", "내용3", "글쓴이2", new Date()));

		FileOutputStream fos = new FileOutputStream("C:/Temp/board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close();

	}

	public static List<Board> readList() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("C:/Temp/board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Board> list = (List<Board>) ois.readObject();
		return list;
	}

}
