package Day01;

import java.util.Scanner;

public class Ex02_Scanner {

	public static void main(String[] args) {

		//객체 생성 - new
		//클래스 타입 클래스명 = new 클래스명();
		//기본 입력 객체 - Scanner

		Scanner sc = new Scanner(System.in);

		//경고 - 노란색 : 발생해도 프로그램 실행 가능
		//에러 - 빨간색 : 발생하면 프로그램 실행 불가능
		//변수선언
		//자료형 변수명;
		//변수선언 및 초기화
		//nextInt() : 키보드로부터 정수 하나를 입력받는 메소드

		System.out.print("a : ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		//"문자열" : 문자열은 큰 따옴표로 표현한다.
		//문자열과 숫자 연결하기
		//"문자열" + 숫자
		// 문자열과 숫자를 +(문자열 연결 연산자)로 연결할 수 있다.
		//이때, 숫자(int) 자료형이 문자열 자료형으로 변환되어 연결된다. 

		System.out.println("a :" + a);

		System.out.println("b :" + b);

		//클래스는 파스칼 케이스로 작성 - 첫글자가 대문다
		//메소드는 카멜케이스로 작성 - 첫글자 소문자, 다음문자 대문자.
		//close() Scnner 객체를 닫는 메소드 (메모리 해제) 
		sc.close();

		//Scanner 객체가 닫힌 이후에는 입력을 받을 수 없다.
	}
}