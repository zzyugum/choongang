package daodto0620;

import java.util.ArrayList;

public class Dao {
	ArrayList<Dto> dbtable = new ArrayList<>();
	Dao(){
		for (int i = 0; i < 4; i++) {
			Dto dto = new Dto(i+1, "김"+(i+1));
			dbtable.add(dto);
		}
	}
	
	void getConnection() {}
	
	ArrayList<Dto> selectlist() {
		getConnection();
		ArrayList<Dto> lst = dbtable;
		return lst;
	}
	
	void deleteOne() {}
	
	void insertOne(Dto dto) {
		dbtable.add(dto);
	}

	void updateOne() {}
}
