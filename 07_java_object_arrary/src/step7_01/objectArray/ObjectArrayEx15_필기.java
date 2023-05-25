package step7_01.objectArray;

import java.util.ArrayList;

// DTO (DataTransferObject) : 데이터 전송 모델 객체

class StudentOEC {
	String id;
	String pw;
	
	void printData() {
		System.out.println("이름 : " + this.id + "비밀번호 : " + this.pw);
	}
	
}

class StudentController {
	 ArrayList<StudentOEC> List = new ArrayList<StudentOEC>();
	 
	 void addStudent(StudentOEC studentOEC) {
		 List.add(studentOEC);
	 }
	 
	 StudentOEC removeStudent(int index) {
		 StudentOEC deletedObj = List.get(index);
		 List.remove(index);
		 return.deletedObj;
	 }
}

public class ObjectArrayEx15_필기 {

	public static void main(String[] args) {
		

	}

}
