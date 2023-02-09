package Day07.Ex01_NestedClass;

public class InnerInterfaceEx {
	// 중첩 인터페이스의 아우터 클래스인 객체 I 생성
	public static void main(String[] args) {	
	
	I i = new I();
	
	//구현 객체를 메소드를 통해 지정
	i.setInterface(new implClass());
	i.method();
	
	}
}
