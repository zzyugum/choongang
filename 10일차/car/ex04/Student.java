package car.ex04;

public class Student {

	String name;
	int kor;
	int math;
	int eng;
	
	
	
	public Student(String name, int kor, int math, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng + "]";
	}



	public static void main(String[] args) {

//		String[] arr = {"sdfsdf"};
		Student[] arr = new Student[3];
		arr[0] = new Student("name", 1, 3, 4);
		arr[1] = new Student("name", 1, 3, 4);
		arr[2] = new Student("name", 1, 3, 4);
		
//		arr[0] ="홍";
//		arr[1] ="길";
//		arr[2] ="동";
		for(int i = 0 ; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
