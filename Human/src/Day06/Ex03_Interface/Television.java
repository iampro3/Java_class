package Day06.Ex03_Interface;

/**
 * @author User
 * JAVA doc 문서 작성
 * 자바 doc 문서 작성에 대해서 알아본다.
 */
public class Television implements RemoteControl {
	
	
	private int volume;
	@Override // - 객체 재정의
	public void turnOn() {
		System.out.println("TV 전원을 켭니다.");		
	}

	@Override
	public void turnOff() {
		System.out.println("TV 전원을 끕니다.");		
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
		System.out.println("현재 TV 볼룸 :" + this.volume);		
	}
}
