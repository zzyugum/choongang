package api0616.ex01;

import java.util.Objects;

public class Student {

	private String studentNum;
	
	public Student(String studentNum) {
			this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		
		return studentNum;
	}


//	@Override
//	public int hashCode() {
//		return Objects.hash(studentNum);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return Objects.equals(studentNum, other.studentNum);
//	}

	
//	@Override
//	public int hashCode() {
//		return Objects.hash(studentNum);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Student) {
//			Student student = (Student) obj;
//			if(studentNum.equals(student.studentNum)){
//				return true;
//			}
//		}
//		return false;
//	}
}
