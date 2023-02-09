package Day07.Ex03_MultipleInterface;

//인터페이스 다중상속
//public interface 인터페이스 extends 인터페이스A, B..{
public interface SmartRemoteControl extends RemoteControl, Microphone{
	
	//터치패드 기능
	// - x,y 좌표 위치에 터치패드를 클릭
	void touch(int x, int y);
	
	
}
