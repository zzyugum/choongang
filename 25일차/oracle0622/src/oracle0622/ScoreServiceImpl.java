package oracle0622;

import java.sql.SQLException;
import java.util.ArrayList;

public class ScoreServiceImpl {
	ScoreDao dao = new ScoreDao();

	void insert(String name, int kor, int eng, int math) throws SQLException {

		dao.insert(name, kor, eng, math);
	}

	ArrayList<ScoreDto> select() {
		
		return dao.select(); 
	}
	Integer[] max() {
		
		return dao.maxscore();
	}
	int avg() {
		
		return dao.scoreavg();
	}
	void delete(int num) {
		
		dao.delete(num);
		
	}
	ScoreDto selectone(int num) {
		
		return dao.selectone(num);
		
	}
	void update(int num,int kor, int eng, int math) {
		dao.update(num, kor, eng, math);
		
	}
}
