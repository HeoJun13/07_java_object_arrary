package step7_01.objectArray;

class Client {
	
	String id;
	String passwd;
	String name;
	String birth;
	int age;
	String contact;
	String address;
	
	void setData(String id, String passwd, String name, String birth, int age, String contact, String address) {
		
		
		
		this.id = id;            //파라메타로 전달된 데이터를 필드에 대입
		this.passwd = passwd;    //파라메타로 전달된 데이터를 필드에 대입
		this.name = name;        //파라메타로 전달된 데이터를 필드에 대입
		this.birth = birth;      //파라메타로 전달된 데이터를 필드에 대입
		this.age = age;          //파라메타로 전달된 데이터를 필드에 대입
		this.contact = contact;  //파라메타로 전달된 데이터를 필드에 대입
		this.address = address;  //파라메타로 전달된 데이터를 필드에 대입
		
		
	}
	
	void prrintData() {
		System.out.println(this.id + "/" + this.passwd + " / " + this.name + " / " + this.birth + " / " + this.age + "/" + this.contact + "/" + this.address + "/");
	}
	
	
	
	
}





public class ObjectArrayEx05_연습 {

	public static void main(String[] args) {
		
		Client[] clientList = new Client[3];
		for (int i = 0; i < clientList.length; i++) {
			clientList[i]= new Client();
		}
		
		
		// before
		clientList[0].id = "user1";
		clientList[0].passwd = "1111";
		clientList[0].name = "사용자1";
		clientList[0].birth = "1998-06-05";
		clientList[0].age = 26;
		clientList[0].contact= "010-5555-8888";
		clientList[0].address= "서울";
		
		
		
		//After
		clientList[1].setData("user2", "2222", "사용자2", "1999-08-04", 25, "010-4568-5468", "경기");
		clientList[2].setData("user3", "3333", "사용자3", "1997-08-04", 27, "010-6685-2168", "대전");
		
		
		//test
		clientList[0].prrintData();
		clientList[1].prrintData();
		clientList[2].prrintData();

	}

}
