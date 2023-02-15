package Day11.Ex01_Generic;

class A {}

class B extends A{}
class C extends B{}

// A-> B
// B-> C

//타입 지정이 가능한 클래스 : B, c
class D<T extends B>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
public class LimitedTypeClass {
	public static void main(String[] args) {
		D<B> d1 = new D<B>();
		D<C> d2 = new D<C>();
		
		//D<A> d3 = new D<C>(); //A타입은 제한됨
		//D클래스 타입 매개변수를 B 클래스로 제한하고 있기 때문에 
		//D클래스의 자식 클래스인 B와 C만 가능하다
		
		d1.setT(new B());
		d1.setT(new C());
		
		d1.setT(new C());	//d1<B> <-자식객체인 C 대입 불가(업캐스팅)
		//d2.setT(new B());	//d2<C> <-부모객체인 B 대입 불가
		
		//타입 지정을 생략하면, 제네릭 타입을 제한한 B 클래스를 기본으로 생성된다.
		D d4 = new D();		//D<B> d4= new D<>(); 
		d4.setT(new B());
		d4.setT(new C());
		
	}
	
}
