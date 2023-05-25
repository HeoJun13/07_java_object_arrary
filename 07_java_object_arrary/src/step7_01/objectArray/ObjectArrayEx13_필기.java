package step7_01.objectArray;

import java.util.ArrayList;

class TvP {
	
	String name;
	String brand;
	int price;
	
	void set(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;

	}
	
	
}


public class ObjectArrayEx13_필기 {

	public static void main(String[] args) {
		
		ArrayList<Tv> list = new ArrayList<Tv>();
		
		Tv temp = new Tv();
		temp.setData("상성tv", "삼성전자" , 150000000);
		list.add(temp);
		
		temp = new Tv();
		temp.setData("LG tv", "LG전자" , 100000000);
		list.add(temp);
		
		temp = new Tv();
		temp.setData("애플 tv", "애플" , 300000000);
		list.add(temp);
		
		
		for (Tv tv: list) {
			System.out.println("name : " + tv.name);
			System.out.println("brand : " + tv.brand);
			System.out.println("price : " + tv.price);
			System.out.println();
	}
	
		
		
		
		
	}
}

