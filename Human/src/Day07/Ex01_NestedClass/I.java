package Day07.Ex01_NestedClass;

//아우터 클래스
public class I {
	
	J j;			//인터페이스 선언 바로 가능
	void setInterface(J j) {
		this.j = j;
	}
	
	//중첩 인터페이스
	static interface J{
		void method1();
		void method2();
	}
	
	void method(){
		j.method1();
		j.method2();
	}
	
	
}
