package nested0613.ex01;

public class NestedClassExample {

	public static void main(String[] args) {

		
		Exam02 exam02 = new Exam02();
		
		Exam02.Tire tire = exam02.new Tire();
		
		Exam02.Engine engine = new Exam02.Engine();

	}

}
