package step7_01.objectArray;

import java.util.ArrayList;
import java.util.Arrays;




class MyArrayList2 {
	
	int[] arr;
	int elementCnt;
	
	void print() {
		
		System.out.println(Arrays.toString(arr));
	}
	
	void add(int value) {
		
		if(elementCnt == 0) {
			arr = new int[elementCnt + 1];
		}
		else if (elementCnt > 1) {
			int[] temp = arr;
			arr = new int[elementCnt + 1];
			
			for (int i = 0; i < elementCnt; i++) {
				arr[i] = temp[i];
			}
			temp = null;
		}
		
		arr[elementCnt] = value;
		elementCnt++;
		
	}
	
	void add(int index, int value) {
		
		if(elementCnt == 0) {
			arr = new int[elementCnt + 1];
			
		}
		else if(elementCnt > 0) {
			int[] temp = arr;
			arr = new int[elementCnt +1];
			
			int j = 0; //빈공간의 역할 수정을 가능하게 해주는 역할?
			for (int i = 0; i < elementCnt; i++) {
				if (i != index) {
					arr[i] = temp[j++];
				}
			}
			temp = null;
		}
		arr[index] = value;
		elementCnt++;
		
	}
	
	void remove(int index) {
		
		if (elementCnt == 1) {
			arr = null;
		}
		else if (elementCnt > 1 ) {
			int[] temp = arr;
			arr = new int[elementCnt - 1];
			
			int j = 0; //빈공간의 역할 수정을 가능하게 해주는 역할?
			for (int i = 0; i < temp.length; i++) {
				if ( i != index) {
					arr[j++] = temp[i];
				}
			}
			temp = null;
		}
		elementCnt--;
	}
	
	int size() {
		return elementCnt;
	}
	int get(int index) {
		return arr[index];
	}
	void set ( int index , int value) {
		arr[index] = value;
	}
	
	void clear () {
		arr = null;
	}
	
}


public class ObjectArrayEx14_필기 {

	public static void main(String[] args) {
		
		ArrayList<Integer> Array = new ArrayList<Integer>();
		
		Array.add(10);
		Array.add(20);
		Array.add(30);
		Array.add(40);
		Array.add(50);
		System.out.println(Array);
		
		Array.add(0, 9);
		System.out.println(Array);
		
		Array.remove(3);
		System.out.println(Array);
		
		int elementCnt = Array.size();
		System.out.println(" elementCnt : " + elementCnt);
		
		for (int i = 0; i < elementCnt; i++) {
			System.out.print(Array.get(i));
			if ( i != elementCnt -1 ) {
				System.out.print(" / ");
				
			}
		}
		System.out.println(" ] ");
		
		Array.set(2, 5);
			System.out.println(Array);
		Array.clear();
		System.out.println(Array);
		
		
		System.out.println("\n========================================\n");

		
		
		
		MyArrayList MyList = new MyArrayList();
		
		MyList.add(10);
		MyList.add(20);
		MyList.add(30);
		MyList.add(40);
		MyList.add(50);
		MyList.add(60);
		MyList.add(70);
		MyList.add(80);
		
		
		// 삽입
		MyList.add(0,5);
		MyList.print();
		
		// 인덱스 지우기
		MyList.remove(2);
		MyList.print();
		
		//길이 구하기
		int elementCount =  MyList.size();
		System.out.println("elementCount : " + elementCount);
		
		System.out.print("[");
		for (int i = 0; i < elementCount; i++) {
			System.out.print(MyList.get(i));
			if ( i != elementCount -1) {
				System.out.print(" , ");
			}
		}
		System.out.println(" ] ");
		
		// 수정
		MyList.set(6, 120);
		MyList.print();
		
		MyList.clear();
		System.out.println(MyList.size());
		
	}

}
