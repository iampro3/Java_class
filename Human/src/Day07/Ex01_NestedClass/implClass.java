package Day07.Ex01_NestedClass;

public class implClass implements I.J {

	@Override
	public void method1() {	
		System.out.println("중첩 인터페이스 - method1()");
	}

	@Override
	public void method2() {
		System.out.println("중첩 인터페이스 - method2()");		
	}	
}
