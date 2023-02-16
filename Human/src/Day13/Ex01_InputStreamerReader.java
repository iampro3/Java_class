package Day13;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01_InputStreamerReader {
	
	public static void main(String[] args) {
		//문자 스트림 클래스
		//System.in 키보드로부터 문자입력 : 직접 결과창에 문자 입력한다.
		InputStreamReader is = new InputStreamReader(System.in);
		
		while(true) {
			char ch = 0;
			
			try {
				ch= (char) is.read();		//입력 스트림으로부타 한 글자씩 읽어옴.
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			//read ()로 더 이상 읽어올 문자가 없으면 -1을 반환
			if(ch == -1 ) {
				break;
			}
			System.out.println(ch);
		}
	}
}
