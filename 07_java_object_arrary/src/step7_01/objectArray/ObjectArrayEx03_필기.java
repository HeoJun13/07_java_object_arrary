package step7_01.objectArray;

class Account1 {
	 
	String id; 
	int money;
	
}

public class ObjectArrayEx03_필기 {

	public static void main(String[] args) {
		
		Account[] money = new Account[5];
		for (int i = 0; i < money.length; i++) {
			money[i] =  new Account();
		}
		
		money[1].id = "wnsgh9857";
		money[1].money = 510000;
		
		
		for (int i = 0; i < money.length; i++) {
			System.out.println(money[i].id + " " + money[i].money);
		}
				
		
	
	}

}
