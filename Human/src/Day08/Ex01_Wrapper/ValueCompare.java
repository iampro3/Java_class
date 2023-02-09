package Day08.Ex01_Wrapper;

public class ValueCompare {
	public static void main(String[] args) {
		Integer intObj1=10;
		Integer intObj2=10;
		
		System.out.println("intObj1 == intobj2");
		System.out.println("결과 : " + (intObj1 == intObj2));		// 정수의 범위 안에 있기 때문에 true : 레퍼런스 끼리 비교하는 것이기 때문에.
		System.out.println("연박싱하여 비교");
		System.out.println("결과 :" + (intObj1.intValue() ==intObj2.intValue() ) );
		System.out.println("equals() 매소드로 비교");
		System.out.println("결과 :" + intObj1.equals(intObj2));
		
		System.out.println("------------");
		
		Integer intObj3 =200;
		Integer intObj4=200;
		
		// ==, != 기호로 래퍼객체를 비교하면
		// 아래의범위에서는 내부의 값을  ==,!= 기호로 바로 비교가 가능
		//Boolean 타입		: true, false
		// 정수타입				:-128~127
		// char				: \u1000~\007f
		
		System.out.println("intObj3 == intObj4");
		System.out.println("결과 :" + (intObj3 == intObj4));
		System.out.println("연박싱하여 비교");
		System.out.println("결과 : " + (intObj3.intValue() ==  intObj4.intValue()));
		//equals()		:래퍼객체가 가진 내부의 값을 비교하는 메소드
		System.out.println("equals() 메소드로 비교");
		System.out.println("결과 : " + intObj3.equals(intObj4));
		
	}
}
