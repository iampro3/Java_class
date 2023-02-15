package Day11.Ex01_Generic;

class GenericMethod{
	
	// 제네릭 메소드
	// 반환타입, 매개변수에 타입 매개변수로 사용
	public <T> T method1(T t) {
		return t;
	}
	//매개변수를 타입 매개변수로 사용
	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2);
	}
	
	//매개변수 2개를 타입 매개변수로 사용
	public <K,V> void method3(K k, V v) {
		System.out.println(k+ " : " + v);
	}
}
	public class GenericMethodEx {
		public static void main(String[] args) {
			GenericMethod gm = new GenericMethod();
			
			//제네릭 메소드 호출
			//객체.<타입>메소드명(인자);			
			String str1 = gm.<String>method1("제네릭메소드");
			System.out.println("str1 : " +str1);
			
			//전달인자의 값으로 타입을 유츄할 수 있으면,
			//명시적으로 제네릭 타입, String 생략가능
			String str2 = gm.method1("타입지정 생략 가능");
			System.out.println("str2 : " +str2);
			
			boolean bool1 = gm.<Double>method2(10.5, 10.5);
			System.out.println("bool1 : " + bool1);

			boolean bool2 = gm.<Double>method2(10.5, 20.5);
			System.out.println("bool2 : " + bool2);
			
			gm.<String, Integer>method3("자바 점수", 90);
			gm.method3("HTML 점수", 100);
			
		}
}
