package oracle0622;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ScoreDao {

	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "Scott";
	String pass = "tiger";
	String sql;
	Connection con;
	Statement stmt;
	ResultSet rs;

	void login() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, id, pass);
			stmt = con.createStatement();
		} catch (SQLException | ClassNotFoundException e) {

		}
	}

	ArrayList<ScoreDto> select() {
		ArrayList<ScoreDto> list = new ArrayList<>();
		ScoreDao ls = new ScoreDao();
		ls.login();
		sql = "Select * from score";
		try {
			rs = ls.stmt.executeQuery(sql);
			while (rs.next()) {
				int num = rs.getInt("NUM");
				String name = rs.getString("NAME");
				int kor = rs.getInt("KOR");
				int eng = rs.getInt("ENG");
				int math = rs.getInt("math");
				ScoreDto dto = new ScoreDto(num, name, kor, eng, math);
				list.add(dto);
			}
		} catch (SQLException e) {
		}

		return list;

	}

	void insert(String name, int kor, int eng, int math) throws SQLException {

		ScoreDao ls = new ScoreDao();
		ls.login();
		int num = ls.max() + 1;
		sql = "insert into score(num,name,kor,eng,math) values (" + num + ",'" + name + "'," + kor + "," + eng + ","
				+ math + ")";

		ls.stmt.executeUpdate(sql);
		System.out.println("등록 완료");

	}

	void delete(int num) {

		ScoreDao ls = new ScoreDao();
		ls.login();
		sql = "DELETE FROM score WHERE num ="+ num;
		try {
			ls.stmt.executeUpdate(sql);
			System.out.println("삭제 완료");
		} catch (SQLException e) {
		}

	}

	ScoreDto selectone(int num) {

		ScoreDao ls = new ScoreDao();
		ls.login();
		sql = "Select * from score where num = " + num;
		try {
			rs = ls.stmt.executeQuery(sql);
			if (rs.next()) {
				String name = rs.getString("NAME");
				int kor = rs.getInt("kor");
				int eng = rs.getInt("ENG");
				int math = rs.getInt("MATH");
				ScoreDto dto = new ScoreDto(num, name, kor, eng, math);
				return dto;
			}
		} catch (SQLException e) {
		}

		return new ScoreDto(-1, null, 0, 0, 0);

	}

	void update(int num, int kor, int eng, int math) {

		ScoreDao ls = new ScoreDao();
		ls.login();
		sql = "Update Score set Kor = " + kor + ",eng=" + eng + ",math = " + math + " where num = " + num;
		System.out.println(sql);
		try {
			ls.stmt.executeUpdate(sql);
		} catch (SQLException e) {

		}

	}

	int max() {
		ScoreDao ls = new ScoreDao();
		ls.login();
		int max = 0;
		sql = "SELECT MAX(NUM) FROM Score";
		try {
			rs = ls.stmt.executeQuery(sql);
			if (rs.next()) {
				max = rs.getInt(1);
			}
		} catch (SQLException e) {
		}
		return max;

	}

	Integer[] maxscore() {
		ScoreDao ls = new ScoreDao();
		ls.login();
		int maxkor = 0;
		int maxeng = 0;
		int maxmath = 0;
		Integer[] max = new Integer[3];
		sql = "select max(kor), max(eng), max(math) from score";
		try {
			rs = ls.stmt.executeQuery(sql);
			if(rs.next()) {
				maxkor = rs.getInt(1);
				maxeng = rs.getInt(2);
				maxmath = rs.getInt(3);
				for(int i = 0; i<3; i++) {

					max[i] = rs.getInt(i+1);
				}
			}
		} catch (SQLException e) {}
		return max;

	}
	int scoreavg(){
		ScoreDao ls = new ScoreDao();
		ls.login();
		int avg = 0;
		sql = "select (sum(kor)+sum(eng)+sum(math))/(count(num)*3) from score";
		try {
		rs = ls.stmt.executeQuery(sql);
		if(rs.next()) {
			avg = rs.getInt(1);
		}
		}catch(SQLException e) {}
		return avg;
		
		
	}
}
