package Day07.Ex07_ExceprionThrow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionThrows {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try {
			//input() 메소드 에서 예외를 떠넘겨서, 호출한 곳에서 예외처리 해야함
			input();
			} catch(InputMismatchException e) {
				e.printStackTrace();
				System.err.println("정수를 입력해주세요");
			}
		}
	
	// 예외 던지기(예외 떠넘기기) - throws
	//-예외 처리에 대한 책임을 메소드를 호출한 곳으로 떠넘기기.
	public static void input() throws InputMismatchException{
		
		System.out.print("입력 :");
		int input = sc.nextInt();	//예외 가능성이 있는 부분
				
		System.out.println(input);
	}
}
