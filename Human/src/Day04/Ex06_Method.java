package Day04;

import java.util.Scanner;

public class Ex06_Method {
	
	//메소드 : 특정 기능을 하는 코드의 모음
	public static int plus(int a, int b) {
		int result = a+b;
		return result;
	}
	
	// 접근지정자 (static) 반환타입 메소드 (매개변수1, 2){실행문}
	// public, protected, default, private...
	// static : 프로그램 실행 시, 가장먼서 메모리에 지정, 생략가능
	// 반환타입 : 기본타입, 참조타입, (int, double, string)
	//			return (값); - 반환하는 값의 자료형을 지정.
				// void : 반환값이 없음
				// return(값) : 반환하는 (값)의 자료형을 지정
	// 메소드명 : 직접 이름을 지정, 관례적으로 카멜케이스로 지정.
			   // simpleExample : 첫글자 소문자, 다음단어 대문자.
	// 매개변수 : 메소드 호출 시, 전달한 인자를 순서대로 가져오는 변수
	//
	public static int minus(int a, int b) {
		int result = a-b;
		//return (값);
		//1. 메소드 종료
		//2. 메소드 해제
		//3. (값)을 메소드 호출한 자리로 반환
		return result;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		
		System.out.print("b : ");
		int b = sc.nextInt();
	
		System.out.println( plus(a,b));
		System.out.println( minus(a,b));	// sysout + space
	}
}
