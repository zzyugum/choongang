package sec04.exam01;

public class AaaEx {

	public static void main(String[] args) {

		
		Aaa tt = new Aaa();
		tt.name = "홍길동";
		System.out.println(tt.getName());
		Aaa bb = new Aaa();
		bb.name = "이순신";
		System.out.println(bb.getName());
		Aaa aa = new Aaa();
		tt.go();
		aa.go();
		bb.go();
		
		System.out.println(tt);
		System.out.println(bb);
		System.out.println(aa);


	}
	

}
