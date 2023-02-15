package Day01;

import java.util.Scanner;

	//import : 외부에서 정의된 클래스 파일을 포함한 키워드
	//-import 패키지.클래스명;
	//자동 import 방법
	//클래스명 <--여기에 커서두고 ctrl + space
	//다중 import : ctrl + shift + o

	/**
	* 반지름을 입력받아, 원의 넓이를 구하는 프로그램
	* (원의 넓이) = (원주율) x (반지름)^2
	* @author User	*
	*/

public class Ex07_Circle {

	public static void main(String[] args) {
		//상수
		//- 프로그램 실행 동안 값을 변경하지 않고 사용할 값
		//*상수 선언 시, 반드시 값을 초기화해야 한다.
		//*선언 후에 값을 변경하면 에러가 발생한다.
		//- 키워드 : final

		final double PI = 3.141592;
		Scanner sc = new Scanner(System.in);
		//바로 엔터 : shift + enter
		System.out.print("반지름:");
		double radius = sc.nextDouble();
		double area=PI * radius * radius;
		System.out.println("원의 넓이 :" + area);
	}
}