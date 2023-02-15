package Day01;

public class Ex10_Char {
	
	public static void main(String[] args) {

		char c1 = 'A'; //문자 리터럴 : 'A'(작은 따옴표)
		char c2 = 65; //십진수 -->아스키코드에 매핑된 문자 
		char c3 = '\u0041';
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		int uniCode = c1; // (char) --> (int) 자동형변환 : 65

		char b = (char) (c2 + 1); // (65+1) = 66 --> 'B'
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		System.out.println("c4 : " + c4);
		System.out.println("c5 : " + c5);
		System.out.println("c6 : " + c6);
		System.out.println("A의 코드값 : " + uniCode);
	}		
}
