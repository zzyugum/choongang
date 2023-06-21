package daodto0620;

import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {
		Dao dao = new Dao();
		
		Dto dto = new Dto(5,"홍");
		dao.insertOne(dto);
		
		ArrayList<Dto> list = dao.selectlist();
		for(Dto da : list) {
			System.out.println(da);
		}
	}
	
}
