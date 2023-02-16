package Day13;

import java.io.FileReader;
import java.io.FileWriter;

public class Ex05_TextFileCopy {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		int data =0;
		
		try {
			fr = new FileReader("test.txt");
			fw = new FileWriter("test4.txt");
			
			while ((data = fr.read()) != -1) {
				fw.write(data);
			}
			fr.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("입출력 시, 예외가 발생했습니다.");
			e.printStackTrace();
		}
	}
}
