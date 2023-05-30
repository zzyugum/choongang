package practice;

public class Aaa {

	int a1;		//필드
	static int a2; //정적(고정형) 필드
	//System.out.println(); 불가능
	void println() {
		System.out.println(this.a1);
		System.out.println(Aaa.a2);
	}

	static void sprintln() {
		Aaa aa = new Aaa();
		System.out.println(aa.a1); //스태틱 메소드 안에서 필드를 사용하려면 객체 생성을 해야함
		System.out.println(a2);
	}

}
