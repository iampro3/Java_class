package Day07.Ex03_MultipleInterface;


//다중구현
//public class 클래스명 implements 인터페이스A, B,.....
public class SmartTelevision implements SmartRemoteControl, Searchable{

	int volume;		//볼륨
	int channel;	//채널 번호
	String keyword; //검색
	int x,y;		//터치패드 좌표
	
	@Override
	public void turnOn() {		
		System.out.println("전원 On");
	}

	@Override
	public void turnOff() {		
		System.out.println("전원 Off");		
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("volume : " + volume);		
	}

	@Override
	public String receiveVoice(String voice) {
		System.out.println("음성 입력 : " + voice);		
		return "voice : " + voice;
	}

	@Override
	public int channelSearch(String keyword) {
		int channel = 0;
		switch(keyword) {
		case "엠넷": channel = 27;
			break;
		case "SBS": channel = 6;
			break;
		case "KBS": channel = 7;
			break;
		case "MBC": channel = 11;
			break;
		case "TVN": channel = 40;
			break;	
		}
		return channel;
	}

	@Override
	public String[] contentSearch(String keyword) {
		 String[] movieContents = {"지무비", "고몽TV", "넷플릭스", "디즈니플러스"};
		 String[] idolContents = {"BTS 콘서트", "음악방송", "뉴진스 연말시상식", "아이즈원 팬사인회"};
		
		 String[] choiceContents;
		 switch (keyword) {
		 case "영화" : choiceContents = movieContents;
		 	break;
		 case "아이돌" : choiceContents = idolContents;
		 	break;
		 default: String[] recommendContents = {"추천컨텐츠", "히밥 먹방", "123"};
		 	choiceContents = recommendContents;
		 	break;
		 }
		 return choiceContents;
	}

	@Override
	public void touch(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("(x,y) :" + x+ "," +y);
		
	}

	@Override
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.println("channel : " + channel);
		
	}
	
}
