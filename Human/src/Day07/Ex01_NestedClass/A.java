package Day07.Ex01_NestedClass;

public class A {
	int a,b;
	class B{
		int x,y;
		
		public void bMethod() {
			System.out.println("이너 클래스에서 아우터 클래스 멤버에 접근가능");
			System.out.println("A의 a : " + a);
			System.out.println("A의 b : " + b);
		}
	}
	
	public void aMethod() {
		System.out.println("아우터 클래스에서 이너 클래스의 멤버 접근 불가");
		// 에러 : System.out.println("B의 x : " + x);
		// 에러 : System.out.println("B의 y : " + y);
	}
}
