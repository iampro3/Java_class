package Day01;

public class Ex03_Variable {
	
	public static void main(String[] args) {

		int x; // int형 변수 x 선언
		int y; // int형 변수 y 선언
		int z; // int형 변수 z 선언
		
		//한 줄 복사 단축키 : ctrl + alt + (위/아래 방향키)

		x= 10; // 변수 x에 10 대입
		y= 20; // 변수 y에 20 대입
		z= 30; // 변수 y에 30 대입

		// sysout : ctrl + space

		System.out.println("x : " + x);
		System.out.println("x : " + y);
		System.out.println("x + y = " + (x+y)); // x + y 합계
		System.out.println("x + y + z = " + (x+y+z)); // x + y + z 합계
		System.out.println("(x + y) /2 = " + (x+y) / 2); // 평균
		System.out.println("(x + y + z) /3 = " + (x+y+z) / 3); // 평균
	}	
}
