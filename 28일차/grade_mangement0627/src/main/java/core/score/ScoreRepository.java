package core.score;

import java.util.List;
import java.util.Map;

public interface ScoreRepository {

	void save(Score score);						//한과목 insert
	List<Score> findBysid(Long sid);			//학번으로 성적 검색
	List<Score> findBysubject(String subject);	//과목명으로 성적 검색
	int selectSumBySid(Long sid);				//학번으로 총점 리턴
	double selectAvgSid(Long sid);				//학번으로 평균 리턴
	int selectSumBysubject(String subject);		//과목 전체의 총점
	double selectAvgBysubject(String subject);		//과목 전체의 평균
	int selectMaxBysubject(String subject);
	int selectMinBysubject(String subject);
	Score selectMaxsid(String subject);
	Score selectMinsid(String subject);
//	List<String , Integer> aa ();
}
