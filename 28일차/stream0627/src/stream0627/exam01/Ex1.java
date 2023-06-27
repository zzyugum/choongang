package stream0627.exam01;

import java.util.Arrays;
import java.util.List;

class Student {
	private String name;
	private int score;

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
}

public class Ex1 { // 스트림(컬렉션)

	public static void main(String[] args) {
		
		
		List<Student> list3 = Arrays.asList(
				new Student("홍길동", 95),
				new Student("홍길순", 92),
				new Student("홍길철", 90)
				);
		Double avg = list3.stream()
				.mapToInt(Student::getScore).average().getAsDouble();
		System.out.println(avg);
			int sum = 0;
		for(Student n : list3) {
			sum+=n.getScore();
		}
		double av = (double)sum/list3.size();
		System.out.println(av);
		
		list3.stream().forEach(a->{
			System.out.println(a.getName()+ " : "+ a.getScore())
			;
		});
				
		
		List<String> list2 = 
				Arrays.asList("홍", "김", "이","박");
		list2.stream().forEach(x ->{
			System.out.println(x);
		});
		
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
//		System.out.println(list1.get(2));
//		list1.set(2, 8);
//		System.out.println(list1.get(2));
//		
//		for(int n : list1) {
//			
//			System.out.println(n);
//				
//		}
		list2.stream().forEach(
			a->{System.out.println(a);}
		);
	}

}
