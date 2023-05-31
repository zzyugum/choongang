package Sec05.exam;

public class ClassName {

	int field;
	void method1() {
		this.field=10;
		field2 = 300;
		method3();
	}
	static int field2;
	static void method2() {}
	static void method3() {
		ClassName cn = new ClassName();
		cn.field = 100;
		method2();
	}
	

}
