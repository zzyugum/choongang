package daodto0620;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {

		ArrayList<Dto> list = new ArrayList<>();

		Dto dto2 = new Dto(2, "홍길순");
		Dto dto3 = new Dto(3, "김길동");
		Dto dto4 = new Dto(4, "김길순");

		for (int i = 0; i < 4; i++) {
			Dto dto = new Dto(i+1, "김"+(i+1));
			list.add(dto);
		}

		for(Dto dto : list) {
			
			System.out.println(dto);
		}
	}

}
