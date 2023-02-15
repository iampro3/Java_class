package Day02;

import java.util.Scanner;

public class Ex16_DoWhile {
	
	public static void main(String[] args) {
		
		// 변수 선언 : 메뉴번호, 메뉴 이름
		int menuNo = 0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);
		
		// do~while문
		// : 무조건 1회는 실행 후, 조건 검사하여 반복하여 반복문
		do {
			System.out.println("##### 점심 메뉴판 #####");
			System.out.println("1. 참치마요덮밥");
			System.out.println("2. 잔치국수"); 
			System.out.println("3. 카레");
			System.out.println("4. 맥도날드");
			System.out.println("5. 바나나 우유");
			System.out.println("0. 종료");
			System.out.print("메뉴번호 : ");
			
			menuNo = sc.nextInt();
			
			switch (menuNo) {
				case 1:	menuName = "참치마요덮밥";
						break;
				case 2:	menuName = "잔치국수";
						break;
				case 3:	menuName = "카레";
						break;
				case 4:	menuName = "맥도날드";
						break;
				case 5:	menuName = "바나나우유";
						break;
				default:menuName = "(굶음)";
						break;
			}
			
			// 메뉴번호가 0이 아니면,
			if( menuNo != 0 ) {
				System.out.println(menuName + "(을/를) 먹었습니다.");
			}
			
		} while (menuNo != 0);
		// 무한루프 : 조건이 항상 true가 되는 경우 반복이 계속된다.
		// - 반드시, 반복문 안에 종료조건을 넣어주어야한다.
		System.out.println("메뉴판을 종료합니다.");
		sc.close();
	}
}
