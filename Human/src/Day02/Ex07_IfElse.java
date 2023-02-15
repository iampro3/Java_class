package Day02;

import java.util.Scanner;

public class Ex07_IfElse {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 입력받은 값이 홀수인지 짝수인지 판단하시오.
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		if( input % 2 == 1 ) {
			System.out.println("홀수입니다.");
		} 
		else {
			System.out.println("짝수입니다.");
		}
		
		sc.close();
	}
}
