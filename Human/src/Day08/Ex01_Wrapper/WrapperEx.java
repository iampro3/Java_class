package Day08.Ex01_Wrapper;

public class WrapperEx {
	public static void main(String[] args) {
		//character
		//char -> Character
		//문자타입인 char 기본타입을 객체화한 클래스
		
		//대소문자 변환
		char a ='a';
		char A ='A';
		
		System.out.println(Character.toLowerCase(A));
		System.out.println(Character.toLowerCase(a));
		
		//해당문자가 알파벳인지 확인
		char c1='7', c2 ='k';
		
		if(Character.isDigit(c1)) {
			System.out.println(c1 + "(은/는) 숫자");
	}
		//해당문자가 알파벳인지 확인
		if(Character.isAlphabetic(c2)) {
		System.out.println(c2+"(은/는) 영문자");
	}
	
	//Integer
	//Int -> Integer
	//정수타입인 int 기본타입을 객체화한 클래스
	System.out.println(Integer.parseInt("28"));		//문자열 ->정수
	System.out.println(Integer.toString(28)+2);		//정수 -> 문자열
	System.out.println(Integer.toBinaryString(28));	//2진수 문자열로 변환
	System.out.println(Integer.bitCount(28));		// 2진수 1의 개수
	
	//deprecated? - 더 이상 사용되지 않는 문법
	//Integer i = new Integer(28)
	Integer i=28;	//기본타입 변수처럼 사용한다.
	String srt = "안녕";
	System.out.println(i.doubleValue());  //double 타입으로 변환
	
	//Double
	//double -> Double
	//실수타입인 double 기본타입을 객체화한 클래스
	Double d=3.14;
	System.out.println(d.toString() + 0.06);
	System.out.println(Double.parseDouble("3.14" +0.06));
	
	//Boolean
	//boolean -> Boolean - 불 타입인 boolean 기본타입을 객체화한 클래스
	Boolean b = (i<40);
	System.out.println(Boolean.toString(b));
	System.out.println(Boolean.parseBoolean("false"));
	}
}
	

