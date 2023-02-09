package Day07.Ex06_AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTxt {
	public static void main(String[] args) {		
	
	//스트림
	//- 실제 입력이나 출력이 표현된 데이터 흐름 
	
	//입력받을 수 있는 데이터
	// - 키보드로부터 입력한 키, 파일 등 
	
	//프로그램 <--[스트림] <--(키보드),(파일)
	
	//입력 스트림 클래스		:InputStream
	//파일 입력 스트림 클래스	:FileInputStream
	FileInputStream fis = null;
	
	try {
		fis = new FileInputStream("test.txt");
		
		int read = 0;
		//fis.read()	: .txt 파일을 한 글자씩 데이터로 읽어오는 메소드
		//				- 더 이상 읽어올 데이터가 없으면 -1을 반환
		//가져올 글자가 없으 ㄹ떄까지 반복한다.
		while((read = fis.read()) != -1) {
			//String word = (char)read + "";
			//byte[] wordByte = word.getBytes("utf-8");
			System.out.print((char)read);
		}
	} catch (FileNotFoundException e) {
		//FileNotFoundException : 파일이 없을 때 생성되는 예외
		//예외 발생 원인을 찾아 단계별로 예외 메시지를 출력
		e.printStackTrace();
		System.out.println("파일을 찾을 수 없습니다.");
	}
	catch(IOException e) {
		//IOException : 입출력 과정에서 문제 시 발생하는 예외
		e.printStackTrace();
		System.out.println("입출력 관련 예외 상황 발생");
	}
	finally {
		if(fis!=null) {
			try {
				fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
}
