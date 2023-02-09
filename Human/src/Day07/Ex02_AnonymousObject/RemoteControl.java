package Day07.Ex02_AnonymousObject;

//인터페이스
//자동으로 public static final 자동생성
//상수(final)와 추상 메소드(abstract)로만 생성된다.
public interface RemoteControl {
	
	//상수
	//interface 변수선언 : 값을 바로 초기화 해주어야 한다.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드 : (public abstract)생략해도 자동선언됨
	void turnOn();	//전원 on
	void turnOff();	//전원 off
	//void setVolume(int volume);
	void setVolume(int volume);	//소리 설정
	
	// 디폴드 메소드는 - 구현객체에 할당될 인스턴스 메소드
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("음소거 설정");
		else
			System.out.println("음소거 해제");
	}
	
	//static 메소드(정적 메소드)
	// 구현객체가 없어도 인터페이스만으로 호출이 가능한 메소드
	static void changeBattery() {
		System.out.println("배터리 교환");
	}	
}
