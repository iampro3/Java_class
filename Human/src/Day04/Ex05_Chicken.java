package Day04;

import java.util.Scanner;

/*
 *메뉴판#############
 *1. BHC - 뿌링클치킨
 *2. BBQ - 황금올리브 반반치킨
 *3. 노랑통닭 - 후라이드 치킨
 *4. KFC - 핫크리스피치킨
 *5.치킨나라 - 양념치킨
 *6.종료
 *메뉴 번호에 따라 메뉴 변수에 해당메뉴를 저장해주고, "해당메뉴가 주문되었습니다."
 *0을 입력하기 전까지 반복하고,
 *0을 입력하면 반복을 종료합니다.
 *종료, 시, "?개의 주문을 완료하였습니다."라고 출력하시오.
 */
public class Ex05_Chicken {
	
	//메소드: 코드의 모음
	// -메소드 정의
	// [접근지정자](static) 반환타입 메소드명(매개변수1,매개변수1){실행문;}
	// void는 반환할 값이 없음을 알려주는 키워드
	// 메뉴판 출력
	public static void printMenu() {
		//메뉴판
		System.out.println("#########메뉴판#############");
		System.out.println("1.BBQ - 황금올리브 반반치킨");
		System.out.println("2.BHC - 뿌링클치킨");
		System.out.println("3.노랑통닭 - 후라이드 치킨");
		System.out.println("4.KFC - 핫크리스피치킨");
		System.out.println("5.치킨나라 - 양념치킨");
		System.out.println("0.종료");
		System.out.println("######### 입력 :");
	}
	
	public static void main(String[] args) {
		//변수선언
		int menuNo=0;	//메뉴번호
		String menuName = "";
		int count =0; //주문개수
		
		Scanner sc = new Scanner(System.in);
		
		do {
			//메뉴판
			/*
			 * System.out.println("#########메뉴판#############");
			 * System.out.println("1.BBQ - 황금올리브 반반치킨");
			 * System.out.println("2.BHC - 뿌링클치킨"); System.out.println("3.노랑통닭 - 후라이드 치킨");
			 * System.out.println("4.KFC - 핫크리스피치킨"); System.out.println("5.치킨나라 - 양념치킨");
			 * System.out.println("0.종료"); System.out.println("######### 입력 :");
			 */
			
			//메소드 호출
			//메소드명(인자1, 인자2)
			printMenu();	//public static void printMenu(){}의 내용들을 호출함
			//메뉴번호 입력
			menuNo=sc.nextInt();
			//메뉴 선택
			
			//종료조건
			if(menuNo == 0)break; // 메뉴가 0번 입력되면 종료된다.
			
			
			switch(menuNo) {
				case 1: menuName = "황금올리브 반반치킨";
						break;
				case 2: menuName = "BHC - 뿌링클치킨";
						break;
				case 3: menuName = "노랑통닭 - 후라이드 치킨";
						break;
				case 4: menuName = "KFC - 핫크리스피치킨";
						break;	
				case 5: menuName = "치킨나라 - 양념치킨";
						break;
						default:menuName = "(선택안함)";
						break;
			}
			//유효성 검사
			//메뉴번호는 0~5번까지 가능
			if(menuNo >= 0 && menuNo <=5) {
				System.out.println(menuName+ "이 주문되었습니다.\n");
				count++;
			}
			else {
				System.out.println(menuName+ "0~5번 사이의 정수를 입력해주세요.\n");
			}		
			
			//주문 출력
		}
		while(true); {
			System.out.println(count + " 개의 주문을 완료하였습니다.");
		}
		sc.close();
	}
}
