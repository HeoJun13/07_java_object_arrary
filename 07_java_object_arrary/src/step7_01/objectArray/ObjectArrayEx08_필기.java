package step7_01.objectArray;

import java.util.Scanner;

class subject5 {
	
	String name;
	int score;
	
}

class Student5 {
	
	subject5[] subject;
	String name;
	
	
}


public class ObjectArrayEx08_필기 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// # 학생 추가 삭제 컨트롤러
		//   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
		//   김철수 : 과목3개 수학 50 국어50 영어 60 
		//   이만수 : 과목2개 수학 20 국어 30 
		//   이영희 : 과목1개 수학 100
		
		Student5[] StudentList = new Student5[3];
		int StudentCnt = 0;
		
		while(true) {
			
			for (int i = 0; i < StudentCnt; i++) {
				System.out.print("[" + (i+1) + "]" + StudentList[i].name + "학생>>");
				if (StudentList[i].subject != null) {
				   for (int j = 0; j < StudentList[i].subject.length; j++) {
					System.out.print("[" + (j+1)+ "]" + StudentList[i].subject[j].name +"과목 = ");
				 }
				}
				System.out.println();
			}
			
			System.out.println("[1] 학생 추가하기");
			System.out.println("[2] 과목 추가하기");
			System.out.println("[3] 성적 추가하기");
			System.out.println("[4] 종료하기");
			int choice = scan.nextInt();
			
			if (choice == 1) {
				System.out.print(" 추가할 학생이름 입력 : ");
				String name = scan.next();
				
				StudentList[StudentCnt] = new Student5();
				StudentList[StudentCnt].name = name;
				StudentCnt++;
				
			} else if (choice == 2) {
				
				for (int i = 0; i < StudentCnt; i++) {
					System.out.println("[" + (i+1) + "]" + StudentList[i].name);
				}
				System.out.println("학생 선택 : ");
				int select = scan.nextInt();
				select--;
				
				System.out.print("과목 입력 : ");
				String subject = scan.next();
				
				if(StudentList[select].subject == null) {
					
					StudentList[select].subject = new subject5[1];
					StudentList[select].subject[0] = new subject5(); 
					StudentList[select].subject[0].name = subject;
					
				}
				else {
					
					int size = StudentList[select].subject.length;
					
					subject5[] temp = StudentList[select].subject;
					StudentList[select].subject = new subject5[size + 1 ];
					
					for (int i = 0; i < temp.length; i++) {
						StudentList[select].subject[i] = temp[i];
						
					}
					
					StudentList[select].subject[size] = new subject5();
					StudentList[select].subject[size].name = subject;
					
					temp = null;
				}
				
			} else if (choice == 3 ) {
				
				for (int i = 0; i < StudentCnt; i++) {
					System.out.println("[" + (i+1) + "]" + StudentList[i].name);
				}
				System.out.println(" 학생 선택 : ");
				int select1 = scan.nextInt();
				select1--;
				
				if (StudentList[select1].subject != null) {
					for (int i = 0; i < StudentList[select1].subject.length; i++) {
						System.out.println("[" + (i+1) + "]" + StudentList[select1].subject[i].name);
					}
					
				}
				System.out.println("과목 선택 :");
				int num = scan.nextInt();
				num--;
				
				System.out.println("성적 선택 : ");
				int score = scan.nextInt();
				
				StudentList[select1].subject[num].score = score;
			}
			else if (choice == 4) {
				System.out.println("종료");
				break;
			}
			
		}
		
		
		
		

	}

}
