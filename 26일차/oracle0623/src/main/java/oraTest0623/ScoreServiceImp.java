package oraTest0623;

import java.util.ArrayList;

public class ScoreServiceImp {
	ScoreDao dao = new ScoreDao();
	
	public ArrayList<ScoreDto> studentList() {
		return dao.selectList();
	}
	public int insert(ScoreDto dto) {
		
		return dao.insertOne(dto);
	}
	public int maxnum() {
		
		return dao.max();
	}
	public double selavg(int num) {
		
		return dao.selectAvg(num);
	}
	public int selmaxscore(int num) {
		
		return dao.selectTotalscore(num);
	}
	public ScoreDto selOne(int num) {
		
		return dao.selectOne(num);
	}
	public double totalavg() {
		
		return dao.selectTotalAvg();
	}
	public int maxkor() {
		
		return dao.maxkor();
	}
	public int maxeng() {
		
		return dao.maxeng();
	}
	public int maxmath() {
		
		return dao.maxmath();
	}
	public double avgmath() {
		
		return dao.avgmath();
	}
	public double avgeng() {
		
		return dao.avgeng();
	}	
	public double avgkor() {
		
		return dao.avgkor();
	}

}
