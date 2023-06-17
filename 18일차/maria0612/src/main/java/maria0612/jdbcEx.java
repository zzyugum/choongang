package maria0612;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcEx {

	public static void main(String[] args) 
			throws SQLException, ClassNotFoundException {
		Scanner scan = new Scanner(System.in);
		Connection con = null;
		Statement stmt = null; // insert selet 등의 명령을 위한 변수
		ResultSet rs = null; //select 후에 자료를 메모리에 받아오는 변수
		String url = "jdbc:mariadb://localhost:3307/jspdb";
		String user = "root";
		String pass = "maria";
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("드라이버 로딩!");
		con = DriverManager.getConnection(url, user, pass);
		System.out.println("접속 성공!");
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("주소 : ");
		String addr = scan.nextLine();
		System.out.print("전화번호 : ");
		String phon = scan.nextLine();
		String sql = "insert into person (name,addr,phon) values"
				+"('"+name+"','"+addr+"','"+phon+"')";
		stmt = con.createStatement();
		int ret = stmt.executeUpdate(sql);
		System.out.printf("%d 건 입력!\n", ret);
	}

}
