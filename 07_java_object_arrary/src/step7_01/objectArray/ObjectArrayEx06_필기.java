package step7_01.objectArray;

class Member1{

		String name;
		int num;
	
}

class Mumbermanager1 {
	
	Member1[] memberList = new Member1[3];
}

public class ObjectArrayEx06_필기 {

	public static void main(String[] args) {
		
		Mumbermanager1 mg = new Mumbermanager1();
		Member1 m1 = new Member1();
		mg.memberList[0] = m1;
		m1.name = "김향민";
		m1.num = 1520;
		
		m1 = new Member1();
		mg.memberList[1]= m1;
		m1.name = "허민수";
		m1.num = 1212;
		
		m1 = new Member1();
		mg.memberList[2]= m1;
		m1.name = "정민처";
		m1.num = 1922;
		
		for (int i = 0; i < mg.memberList.length; i++) {
			System.out.println("num : " + mg.memberList[i].num);
			System.out.println("name : " + mg.memberList[i].name);
			System.out.println();
		}
		
		Member1 temp = mg.memberList[1];
		System.out.println("num : " + temp.num);
		System.out.println("name : " + temp.name);
	
	}

}
