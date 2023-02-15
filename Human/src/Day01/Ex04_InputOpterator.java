package Day01;

import java.util.Scanner;

public class Ex04_InputOpterator {	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("x +" );
		int x = sc.nextInt();
	
		System.out.print("y +" );
		int y = sc.nextInt();
	
		System.out.print("z +" );
		int z = sc.nextInt();
	
		int sum = x+y+z;
		int avg = sum /3;
	
		System.out.println("합계 :" + sum);
		System.out.println("합계 :" + avg);
	
		// avg는 int(정수)형 변수라서 소수부분을 표현할 수 없다.
		//평군을 구한 소수점까지 표현하려면 실수형 변수를 사용해야 한다.
	
		sc.close();
	}
}
