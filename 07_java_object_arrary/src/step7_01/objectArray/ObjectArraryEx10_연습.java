package step7_01.objectArray;

import java.util.ArrayList;

public class ObjectArraryEx10_연습 {

	public static void main(String[] args) {
		
		//ArrayList<Integer> list = new ArrayList<Integer>();     
		//ArrayList<Integer> list = new ArrayList<>();           // 우변의 제네릭의 데이터형은 생략 가능하다.
		//ArrayList<String> list = new ArrayList<String>();
		//ArrayList<Product> list = new ArrayList<Product>();
		//ArrayList<Member> list = new ArrayList<Member>();
		
		ArrayList<Product> productlist = new ArrayList<>();
		
		
		for (int i = 10; i < 1; i--) {
			Product temp = new Product();
			temp.name = "기종" + i;
			temp.price = 100000 + i;
			productlist.add(temp);
			
			
		}
	}

}
