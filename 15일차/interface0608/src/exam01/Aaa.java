package exam01;

public interface Aaa {

	int x = 100; //상수 : 변경이 안되는 값
	//Aaa(){}  기본 생성자 생성 불가능
	
	//void method3() {} 메소드 정의 불가능
	void mathod4(); //추상 메소드만 가능
}
interface Ccc {
	void method5();
}

class Bbb implements Aaa, Ccc{

	void method() {
		
		System.out.println(x);
	}

	@Override
	public void method5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mathod4() {
		// TODO Auto-generated method stub
		
	}
	
}
