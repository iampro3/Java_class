package Day07.Ex01_NestedClass;

/* 중첩클래스
 * 
 */
public class X {
	
	X(){
		System.out.println();		
	}
	//인스턴스 이너클래스
	//* 인스턴스 이너 클래스 안에서 static 멤버 사용 불가 
	// : 메모리가 할당이 가장 먼저 되는데 X 클래스가 생성되기도 전에 선언되었기 때문에
	class Y{
		int value1;
		//static int value2;
		Y(){
			System.out.println("X의 Y 객체 생성");
		}
		void method1() {
			System.out.println("Z의 메소드");
		}
		void method2() {
			System.out.println("Z의 static 메소드");
		}		
		
//		static void method2() {
//			System.out.println("static 메소드 사용불가");
//		}
		
	}
	//static 이너클래스
	// *static 이나 클래스에서 static 멤서 사용가능
	static class Z{
		int value1;
		static int value2;
		
		Z(){
			System.out.println("X의 Z객체 생성");
		}
		void method1() {
			System.out.println("Z의 메소드");
		}
		static void method2() {
			System.out.println("Z의 static 메소드");
		}
	}
	
	//로컬 클래스
	//메소드 내의 정의한 클래스
	//-메소드가 실행될 때만 사용되는 이너클래스
	void method() {
		//로컬 클래스
		class L {
			int value1;
			L(){
			//int static value2; // 사용불가
			System.out.println("L 객체가 생성");
			}
			void method1() {
				System.out.println("L의 메소드");
			}	
			//static void method2(){
			//System.out.println("L의 static 메소드");
		}	
		L l = new L();
		l.value1 = 10;
		System.out.println("로컬 클래스의 l");
		l.method1();
	}
}
