package Day06.Ex03_Interface;

public class RemoteControlEx {
	public static void main(String[] args) {
		//인터페이스틑 객체로 생성불가
		//인터페이스틑 구현객체 생성
		RemoteControl tvRc = new Television();
		tvRc.turnOn();
		tvRc.turnOff();
		tvRc.setVolume(5);
		tvRc.setVolume(100);
		tvRc.setMute(true);
		tvRc.turnOff();
		System.out.println();
		
		RemoteControl speakerRc = new Speaker();
		speakerRc.turnOn();		
		speakerRc.setVolume(5);
		speakerRc.setVolume(100);
		speakerRc.setMute(false);
		speakerRc.turnOff();
		System.out.println();
		
		RemoteControl.changeBattery();
	}
}
