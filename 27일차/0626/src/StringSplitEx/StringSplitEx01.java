package StringSplitEx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;

class Member {
	String name;
	int age;
	String addr; 
	String phone;
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", addr=" + addr + ", phone=" + phone + "]";
	}
	public Member(String name, int age, String addr, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.phone = phone;
	}

	
}

public class StringSplitEx01 {

		static ArrayList<Member> list = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test7.txt");

		BufferedReader br = new BufferedReader(reader);

//		String array = br.readLine();
//		String[] ar = array.split(",");
//		for(String b : ar) {
//			
//			System.out.println(b);
//		}

		while (true) {
			try {
				String data = br.readLine();
				String[] ar = data.split(",");
					int age1 = Integer.parseInt(ar[1]);
				Member c = new Member(ar[0],age1,ar[2],ar[3]);
				list.add(c);	

				}
			 catch (NullPointerException e) {
				break;
			}

		

		}
		for(Member m : list) {
			System.out.println(m);
		}
	}
}
