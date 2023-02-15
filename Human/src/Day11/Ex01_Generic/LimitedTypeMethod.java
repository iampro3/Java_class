package Day11.Ex01_Generic;

public class LimitedTypeMethod {
	//제네릭 메소드 타입 제한
	//number
	//-자식 클래스 : Integer, Double 등읜 래퍼클래스 외 다ㅜㅅ
	public<T extends Number> void method(T t) {
		System.out.println( t.intValue());
		System.out.println( t.doubleValue());
	}
	
	public static void main(String[] args) {
		LimitedTypeMethod ltm = new LimitedTypeMethod();
		ltm.method(1234.5678);
		//	ltm.method("123.5678");	// 문자열은 제한된다.
	}
}
