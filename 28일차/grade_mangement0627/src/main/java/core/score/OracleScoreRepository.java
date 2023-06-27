package core.score;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OracleScoreRepository implements ScoreRepository {

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		return conn;
	}

	@Override
	public void save(Score score) {

		try {
			Connection conn = this.getConnection();
			Statement stmt = conn.createStatement();
			String sql = String.format("insert into score2(sid,seq,subject,score) " + "values(%d,%d,'%s',%d)",
					score.getSid(), score.getSeq(), score.getSubject(), score.getScore());
			stmt.executeUpdate(sql);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Score> findBysid(Long sid) {
		try {
			List<Score> list = new ArrayList<>();
			Connection conn = this.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "select * from score2 where sid = " + sid;
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Score score = new Score(rs.getLong("sid"), rs.getInt("seq"), rs.getString("subject"),
						rs.getInt("score"));
				list.add(score);
			}
			return list;
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}

	}

//	public List<String,Integer> aa (){
//		Connection conn = this.getConnection();
//		Statement stmt = conn.createStatement();
//		String sql = "select * from score2 where subject ='" + subject + "'";
//		ResultSet rs = stmt.executeQuery(sql);
//	List<String, Integer> list = new ArrayList<>();
//	while (rs.next()) {
//		String subject = rs.getString("subject")
//		Int socre = rs.getInt("score")
//		list.add(rs.getString("subject"),rs.getInt("score"));



	@Override
	public List<Score> findBysubject(String subject) {
		try {
			List<Score> list = new ArrayList<>();
			Connection conn = this.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "select * from score2 where subject ='" + subject + "'";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Score score = new Score(rs.getLong("sid"), rs.getInt("seq"), rs.getString("subject"),
						rs.getInt("score"));
				list.add(score);
			}
			return list;
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int selectSumBySid(Long sid) {
		try {
			Connection conn = this.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "select sum(score) as 합계 from score2 where sid = " + sid;
			ResultSet rs = stmt.executeQuery(sql);
			int sum = 0;
			if (rs.next()) {
				sum = rs.getInt("합계");
			}
			return sum;
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public double selectAvgSid(Long sid) {
		try {
			Connection conn = this.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "select avg(score) as 평균 from score2 where sid = " + sid;
			ResultSet rs = stmt.executeQuery(sql);
			double avg = 0.0;
			if (rs.next()) {
				avg = rs.getDouble("평균");
			}
			return avg;
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int selectSumBysubject(String subject) {
		try {
			Connection conn = this.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "select sum(score) as 합계 from score2 where subject ='" + subject + "'";
			ResultSet rs = stmt.executeQuery(sql);
			int sum = 0;
			if (rs.next()) {
				sum = rs.getInt("합계");
			}
			return sum;
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public double selectAvgBysubject(String subject) {

		try {
			Connection conn = this.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "select avg(score) as 평균 from score2 where subject ='" + subject + "'";
			ResultSet rs = stmt.executeQuery(sql);
			double avg = 0.0;
			if (rs.next()) {
				avg = rs.getDouble("평균");
			}
			return avg;
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int selectMaxBysubject(String subject) {
		try {
			Connection conn = this.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "select max(score) as 최고점수 from score2 where subject ='" + subject + "'";
			ResultSet rs = stmt.executeQuery(sql);
			int max = 0;
			if (rs.next()) {
				max = rs.getInt("최고점수");
			}
			return max;
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int selectMinBysubject(String subject) {
		try {
			Connection conn = this.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "select min(score) as 최저점수 from score2 where subject ='" + subject + "'";
			ResultSet rs = stmt.executeQuery(sql);
			int min = 0;
			if (rs.next()) {
				min = rs.getInt("최저점수");
			}
			return min;
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Score selectMaxsid(String subject) {
		try {
			Connection conn = this.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "select * from score2 where score = (select max(score) from score2 where subject = '" + subject
					+ "')";
			ResultSet rs = stmt.executeQuery(sql);
			Score score;
			if (rs.next()) {
				score = new Score(rs.getLong("sid"), rs.getInt("seq"), rs.getString("subject"), rs.getInt("score"));
				return score;
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();

		}
		return null;

	}

	@Override
	public Score selectMinsid(String subject) {
		try {
			Connection conn = this.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "select * from score2 where score = (select min(score) from score2 where subject = '" + subject
					+ "')";
			ResultSet rs = stmt.executeQuery(sql);
			Score score;
			if (rs.next()) {
				score = new Score(rs.getLong("sid"), rs.getInt("seq"), rs.getString("subject"), rs.getInt("score"));
				return score;
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();

		}
		return null;

	}
}
