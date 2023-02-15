package Day02;

import java.util.Scanner;

public class Ex08_elseIf {
	
	public static void main(String[] args) {
		// 학생의 성적을 입력받아, 학점을 출력하시오.
		// 90 점 이상이면, A
		// 80 점 이상이면, B
		// 70 점 이상이면, C
		// 60 점 이상이면, D
		// 60 점 미만이면, F
		// 학점을 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		String result = "";
		
		if( score >= 90 ) 
			result = "A";
		else if( score >= 80 )
			result = "B";
		else if( score >= 70 )
			result = "C";
		else if( score >= 60 )
			result = "D";
		else
			result = "F";
		
		System.out.println("학점은 " + result + "입니다.");
		
		sc.close();
	}
}
