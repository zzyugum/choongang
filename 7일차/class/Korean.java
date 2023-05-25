package class0525;

public class Korean {

		String nation = "대한민국";
		String name;
		String ssn;


		//클래스를 가져다가 사용하는 사람이 변수값을 정하기 위하여 생성자를 씀
		//가져다가 쓰는 사람이 사용을 안하고 고정된 값이 필요할땐 필드에서 값을 정해서 초기화를 시켜줌
public Korean(String name,String ssn) {	
	
		this.name = name;
		this.ssn = ssn;
	
}
}
