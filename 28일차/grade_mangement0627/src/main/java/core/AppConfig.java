package core;

import core.score.OracleScoreRepository;

public class AppConfig {

	public OracleScoreRepository scoreRepositry() {
		return new OracleScoreRepository();
	}
	
}
