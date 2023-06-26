package oraTest0623;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ScoreDao {
	Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		return conn;
	}

	public ArrayList<ScoreDto> selectList() {
		try {
			Connection conn = this.getConnection();
			ArrayList<ScoreDto> list = new ArrayList<>();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select num, name, kor, eng, math from score order by num");
			while (rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int kor = rs.getInt("kor");
				int eng = rs.getInt("eng");
				int math = rs.getInt("math");
				ScoreDto dto = new ScoreDto(num, name, kor, eng, math);
				list.add(dto);
			}
			return list;
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;

	}

	public int insertOne(ScoreDto dto) {
		try {
			Connection conn = this.getConnection();
			Statement stmt = conn.createStatement();
			String sql = String.format("insert into score (num,name,kor,eng,math) values (%d, '%s', %d, %d, %d)",
					dto.getNum(), dto.getName(), dto.getKor(), dto.getEng(), dto.getMath());
			return stmt.executeUpdate(sql);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public NumberDto selectMax() {
		NumberDto dto = null;
		try {
			Connection conn = this.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select max(kor), max(eng), max(math) from score");
			if (rs.next()) {
				int kor = rs.getInt(1);
				int eng = rs.getInt(2);
				int math = rs.getInt(3);
				dto = new NumberDto(kor, eng, math);
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return dto;
	}

	public double selectAvg(int num) {

		try {
			Connection conn = this.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt
					.executeQuery("select ((sum(kor)+sum(eng)+sum(math))/3.0) from score where num = " + num);
			if (rs.next()) {
				double avg = rs.getDouble(1);
				return avg;
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return 0.0;

	}

	public int selectTotalscore(int num) {
		int max = 0;
		try {
			Connection conn = this.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select (sum(kor)+sum(eng)+sum(math)) from score where num=" + num);

			if (rs.next()) {
				max = rs.getInt(1);

			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return max;
	}

	public double selectTotalAvg() {
		try {
			Connection conn = this.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select (sum(kor)+sum(eng)+sum(math))/(count(*)*3.0) from score");
			if (rs.next()) {
				double totalAvg = rs.getDouble(1);
				return totalAvg;
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return 0.0;
	}

	int max() {
		int max = 0;
		try {
			Connection conn = this.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "SELECT MAX(NUM) FROM Score";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				max = rs.getInt(1);
			}
		} catch (SQLException | ClassNotFoundException e) {
		}
		return max;

	}

	public ScoreDto selectOne(int num) {
		try {
			Connection conn = this.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM Score where num=" + num;
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				String name = rs.getString("name");
				int kor = rs.getInt("kor");
				int eng = rs.getInt("eng");
				int math = rs.getInt("math");
				ScoreDto dto = new ScoreDto(num, name, kor, eng, math);
				return dto;
			}
		} catch (SQLException | ClassNotFoundException e) {
		}
		return new ScoreDto(-1, null, 0, 0, 0);

	}

	public int maxkor() {
		int maxkor = 0;
		try {
			Connection conn = this.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "SELECT max(kor) FROM Score";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				maxkor = rs.getInt(1);
			}
		} catch (SQLException | ClassNotFoundException e) {
		}
		return maxkor;
	}

	public int maxeng() {
		int maxeng = 0;
		try {
			Connection conn = this.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "SELECT max(eng) FROM Score";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				maxeng = rs.getInt(1);
			}
		} catch (SQLException | ClassNotFoundException e) {
		}
		return maxeng;
	}

	public double avgkor() {

		try {
			Connection conn = this.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "SELECT avg(kor) FROM Score";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				double avgkor = rs.getDouble(1);
				return avgkor;

			}
		} catch (SQLException | ClassNotFoundException e) {
		}
		return 0.0;
	}

	public double avgmath() {

		try {
			Connection conn = this.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "SELECT avg(math) FROM Score";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				double avgmath = rs.getDouble(1);
				return avgmath;
			}
		} catch (SQLException | ClassNotFoundException e) {
		}
		return 0.0;
	}

	public double avgeng() {
		try {
			Connection conn = this.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "SELECT avg(eng) FROM Score";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				double avgeng = rs.getDouble(1);
				return avgeng;
			}
		} catch (SQLException | ClassNotFoundException e) {
		}
		return 0.0;
	}

	public int maxmath() {
		int maxmath = 0;
		try {
			Connection conn = this.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "SELECT max(math) FROM Score";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				maxmath = rs.getInt(1);
			}
		} catch (SQLException | ClassNotFoundException e) {
		}
		return maxmath;
	}
}
