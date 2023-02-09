package Day07.Ex04_TryCatch;

import java.util.Scanner;

public class DivideByZero {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;		//피제수 - 나눠지는 수
		int b;		//제수 - 나누는 수
		
		System.out.print("a: ");
		a= sc.nextInt();

		System.out.print("b: ");
		b= sc.nextInt();
		
		//예외 메시지 : java.lang.ArithmeticException : ~~ 에러내용
		//예외 처리문 : try ~ catch
		try {
			System.out.println("a/b =" + a/b);
		}
		
		//catch(예외타입 객체명)
		catch(ArithmeticException e) {
			//예외 발생 시, 예외처리문장
			System.err.println("0으로 나누는 연산은 수학적으로 정의하지 않습니다.");
		}
		
		//finally 블록은 생략가능
		finally {
			//예외발생과 무관하게 실행하는 문장
			//예외처리와 관련한 문장을 작성(메모리를 해제하는 문장 등을 작성)
			sc.close();
		}	
	}
}
