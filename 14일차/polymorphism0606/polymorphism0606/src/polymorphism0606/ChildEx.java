package polymorphism0606;

public class ChildEx {

	public static void main(String[] args) {
		
		Parent parent = new Child();
		parent.feild1 = "data1";
		parent.method1();
		parent.method2();
		//parent.feild2;
		
		
		
		Child child = (Child)parent;
		child.field2 = "yyy";
		child.method3();
		
		
	}
	
}
