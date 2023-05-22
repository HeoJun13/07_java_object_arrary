package step7_01.objectArray;

import java.util.Scanner;



class User1 {
	
	String id;
	int money;
	
}

public class ObjectArrayEx04_필기 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		User[] userList = new User[100];
		
		for (int i = 0; i < userList.length; i++) {
			userList[i] = new User();
		}
		
		int UserCnt = 0;
		
		while(true) {
			
			
			System.out.println("1, 회원가입");
			System.out.println("2, 탈퇴");
			System.out.println("3. 출력");
			System.out.println("4. 종료");
			int dix = scan.nextInt();
			
			if(dix == 1 ) {
				
				User temp = new User();
				
				System.out.println("이름을 입력하세요");
				temp.id = scan.next();
				System.out.println("금액을 입력하세요");
				temp.money = scan.nextInt();
				
				userList[UserCnt] = temp;
				
				UserCnt++;
						
							
			}
			else if(dix == 2) {
			
				System.out.println(" 인덱스를 입력하십시요.");
				int DL = scan.nextInt();
				
				for (int i = 0; i < UserCnt -1; i++) {
					userList[i] = userList[i+1];
				}
				UserCnt--;
				
			}
			else if(dix == 3) {
				
				for (int i = 0; i < UserCnt; i++) {
					System.out.println(userList[i].id + userList[i].money);
				}
				
				}
			else if(dix == 4) {
				break;
			}
			}
				 
				
			}
			
		}
		
