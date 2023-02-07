package Day06.Ex03_Interface;

//implements, : 인터페이스로 구현하는 키워드
public class Speaker implements RemoteControl {

	private int volume;
	@Override
	public void turnOn() {
		System.out.println("스피커전원을 켭니다.");		
	}

	@Override
	public void turnOff() {
		System.out.println("스피커전원을 끕니다.");		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 스피커 볼룸 :" + this.volume);		
	}	
}
