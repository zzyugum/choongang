package web.score0602;

public class Singleton {

	
	public String korKingName;
	public String engKingName;
	public String mathKingName;
	public int korKingScore;
	public int engKingScore;
	public int mathKingScore;
	public Student search(String name) {
		for (Student student : stu) {
			if(name.equals(student.getName())){
				return student;
			}
		}
		return null;
	}
	
	public void makeKing() {
//		for(int i = 0; i<st.stu.length;i++) {
//			if(korKingScore < stu[i].getKor()) {
//				korKingScore = stu[i].getKor();
//				korKingName = stu[i].getName();	
//			}
//		}
		for(Student student : stu) {
			if(korKingScore < student.getKor()) {
				korKingScore = student.getKor();
				korKingName = student.getName();	
			}
		}
		for(Student student : stu) {
			if(engKingScore < student.getEng()) {
				engKingScore = student.getEng();
				engKingName = student.getName();	
			}
		}
		for(Student student : stu) {
			if(mathKingScore < student.getMath()) {
				mathKingScore = student.getMath();
				mathKingName = student.getName();	
			}
		}
	
	}
	
	
	public Student[] stu = new Student[3]; //클래스 배열
	
	private static Singleton st = new Singleton();
	
	private Singleton() {
		// 학생 클래스 배열의 객체를 생성
		for(int i = 0; i<stu.length;i++) {
			stu[i] = new Student();
		}
	
	}
	
	public static Singleton GetInstance() {
		return st;
	}
}
