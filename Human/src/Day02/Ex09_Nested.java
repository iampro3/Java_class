package Day02;

import java.util.Scanner;

public class Ex09_Nested {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정보처리기사 자격증 합격기준
		// 4학년, 70점이상 - 합격
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();

		System.out.print("학년(1~4) : ");
		int year = sc.nextInt();
		
		
		// 중첩 if 문은 권장하지 않는다.
		if( year == 4 ) {
			if( score >= 70 ) {
				System.out.println("합격!");
			} else {
				System.out.println("불합격!");
			}
		} 
		else {
			System.out.println("응시 자격요건에 해당되지 않습니다.");
		}
		
		// 중첩하지 않고 조건을 줄 수 있다.
		if( year == 4 && score >= 70 ) {
			System.out.println("합격!");
		}
		if( year == 4 && score < 70 ) {
			System.out.println("불합격!");
		}
		if( year != 4 ) {
			System.out.println("응시 자격요건에 해당되지 않습니다.");
		}
		
		
	}
}
