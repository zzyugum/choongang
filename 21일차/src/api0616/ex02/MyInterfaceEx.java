package api0616.ex02;

interface MyInterface{
	String method(String str);
}

public class MyInterfaceEx {

	public static void main(String[] args) {
		
		MyInterface myinterface = new MyInterface() {
			
			public String method(String str) {
				
				return str+100;
			}
		};
		
		
		System.out.println(myinterface.method("홍"));
		//람다식
		
		MyInterface mi = (d) -> {return d+200;};

		System.out.println(mi.method("홍"));
		
	}

}
