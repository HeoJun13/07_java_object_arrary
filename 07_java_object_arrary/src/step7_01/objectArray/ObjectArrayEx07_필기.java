package step7_01.objectArray;

//# 클래스 배열 응용

class Subjecter{
	
	String name;
	int score;
	
}


class Student1er{
	
	Subjecter[] subjects;	// Subject 객체를 담을 클래스 배열
	String name;
	
}


public class ObjectArrayEx07_필기 {

	public static void main(String[] args) {
		
		Student1er[] StudenList = new Student1er[3];
		
		StudenList[0] = new Student1er();
		StudenList[0].name = "Chehas";
		StudenList[0].subjects = new Subjecter[3];
		
		for (int i = 0; i < 3; i++) {
			StudenList[0].subjects[i] = new Subjecter();
			StudenList[0].subjects[i].name = "Chehas 과목" + i;
			StudenList[0].subjects[i].score = 90;
			
		}
		
		StudenList[1] = new Student1er();
		StudenList[1].name = "정원";
		StudenList[1].subjects = new Subjecter[2];
		StudenList[1].subjects[0] = new Subjecter();
		StudenList[1].subjects[0].name = "학생2 과목1";
		
		
	}

}
