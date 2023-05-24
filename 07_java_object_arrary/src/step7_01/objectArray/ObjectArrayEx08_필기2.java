package step7_01.objectArray;

import java.util.Scanner;

class Subject1 {
	
	String name;
	int score;
}

class Student1 {
	Subject1[] subjects;
	String name;
}



public class ObjectArrayEx08_필기2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// # 학생 추가 삭제 컨트롤러
		//   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
		//   김철수 : 과목3개 수학 50 국어50 영어 60 
		//   이만수 : 과목2개 수학 20 국어 30 
		//   이영희 : 과목1개 수학 100

		Student1[] studentList = new Student1[3];
		int studentCnt = 0;
		
		while (true) {
			
			for (int i = 0; i < studentCnt; i++) {
				System.out.print("[" + (i+1) + "]" + studentList[i].name + "학생>>>");
				if (studentList[i].subjects != null) {
					for (int j = 0; j < studentList[i].subjects.length; j++) {
						System.out.print("["+ (j+1) +"]"+ studentList[i].subjects[j].name); 		
						}
					
				}
				System.out.println();
			}
			System.out.println("[1] 학생 추가하기");
			System.out.println("[2] 과목 추가하기");
			System.out.println("[3] 점수 추가하기");
			System.out.println("[4] 종료하기");
			int choice = scan.nextInt();
			
			if (choice == 1) {
				
				System.out.println("추가할 학생이름 입력 :");
				String name = scan.next();
				
				studentList[studentCnt] = new Student1();
				studentList[studentCnt].name = name;
				studentCnt++;
				
			}
			else if (choice == 2) {
				
				for (int i = 0; i < studentCnt; i++) {
					System.out.println("[" + (i+1) + "]" + studentList[i].name);
				}
				System.out.println("학생 선택 ;");
				int select = scan.nextInt();
				select--;
				
				System.out.println("과목 추가 :");
				String subject = scan.next();
				
				if (studentList[select].subjects == null) {
					
					studentList[select].subjects = new Subject1[1];
					studentList[select].subjects[0] = new Subject1();
					studentList[select].subjects[0].name = subject;
					
				}
				else {
					
					int size = studentList[select].subjects.length;
					
					Subject1[] temp = studentList[select].subjects;
					studentList[select].subjects = new Subject1[size + 1];
					
					for (int i = 0; i < size; i++) {
						studentList[select].subjects[i] = temp[i];
					}
					
					studentList[select].subjects[size] = new Subject1();
					studentList[select].subjects[size].name = subject;
					
					temp = null;
					
				}
			}
		
		}
	
		
	
		
		


	}

}
