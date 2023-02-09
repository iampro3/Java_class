package Day07.Ex01_NestedClass;

import Day07.Ex01_NestedClass.A.B;

public class NestedClass {
	
	public static void main(String[] args) {
		A a = new A();
		a.a = 10;
		a.b=20;
		System.out.println("A의 a : " + a.a);
		System.out.println("A의 b : " + a.b);
		a.aMethod();
		
		A.B b = a.new B();
		b.x=30;
		b.y=40;
		System.out.println("아우터 클래스에서 이너 클래스의 멤버 접근 불가");
		System.out.println("B의 x : " + b.x);
		System.out.println("B의 y : " + b.x);
		b.bMethod();
	}
	
		
}

