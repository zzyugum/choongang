package core;

import core.score.Score;

public class ScoreApp {

	public static void main(String[] args) {

		AppConfig app = new AppConfig();
		
//		Score score = new Score(1004L, 3, "영어", 98);
//		app.scoreRepositry().save(score);
		
////		System.out.println(app.scoreRepositry().findBysid(1004L));
//		System.out.println(app.scoreRepositry().findBysubject("국어"));
//		System.out.println(app.scoreRepositry().selectSumBySid(1004L));
////		System.out.println(app.scoreRepositry().selectAvgSid(1004L));
//		System.out.println(app.scoreRepositry().selectSumBysubject("국어"));
//		System.out.println(app.scoreRepositry().selectAvgBysubject("국어"));
////
		System.out.println(app.scoreRepositry().selectMaxBysubject("국어"));
		System.out.println(app.scoreRepositry().selectMinBysubject("국어"));
//		System.out.println(app.scoreRepositry().selectMaxsid("수학"));
//		System.out.println(app.scoreRepositry().selectMinsid("수학"));
		
	}

}
