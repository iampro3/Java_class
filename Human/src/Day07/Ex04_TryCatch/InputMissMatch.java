package Day07.Ex04_TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissMatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menuName = "";
		int menuNo =0;
		
		do {
			System.out.println("1. Java");
			System.out.println("2. HTML");
			System.out.println("3. CSS");
			System.out.println("4. JavaScripts");
			System.out.println("5. 종료");
			
			System.out.println("메뉴입력 :");
			
			//try - catch 예외처리문 작성
			try {
				menuNo = sc.nextInt();	//예외 발생 가능성 문장
			}
			catch(InputMismatchException e ) {
				sc.next();				// 입력 스트림에 남아있는 (엔터) 비움
				System.err.println("(0~4) 사이의 값을 입력하세요");	//out->err로 변경하면 빨간 글씨로 출력된다.
				continue;	// 다시 do 문으로 돌아간다.
			}
			
			// 종료조건
			if(menuNo == 0) break;
			
			switch(menuNo) {
			case 1 : menuName = "Java";
					break;
			case 2 : menuName = "HTML";
			break;
			case 3 : menuName = "CSS";
			break;
			case 4 : menuName = "JavaSctipts";
			break;
			default:menuName = "선택없음";
			break;
			}
			System.out.println(menuName + "(을/를)공부합니다");
		}while (true);
		sc.close();
	}
}
