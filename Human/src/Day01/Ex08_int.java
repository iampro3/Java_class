package Day01;

public class Ex08_int {
	
	public static void main(String[] args) {
		// 리터럴
		// : 프로그램에서 직접 표현한 값
		// 정수
		// - 10진수		: 0,1,2,3,4,5,6,7,8,9
		// - 8진수		: 0,1,2,3,4,5,6,7
		//				 * 리터럴 : 0숫자
		// - 16진수		: 0,1,2,3,4,5,6,7,8,9,A, B, C, D, E, F
		//									 10 11 12 13 14 15
		//				 * 리터럴 : 0x숫자
		
		// 10진수
		int var1 = 10;		// 10
		System.out.println("var1 : " + var1);
		
		int var2 = 010;		// 8
		System.out.println("var2 : " + var2);
		
		int var3 = 0x10;	// 16
		System.out.println("var3 : " + var3);		
	}
}
