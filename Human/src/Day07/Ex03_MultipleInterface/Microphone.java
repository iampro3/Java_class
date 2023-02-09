package Day07.Ex03_MultipleInterface;

public interface Microphone {
	int inputVolumeMax = 50;	//음성 최대 인식
	int inputVolumeMin = 5;		//음성 최소 인식
	
	//음석 인식
	String receiveVoice(String voice);
	
}
