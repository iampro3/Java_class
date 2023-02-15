package Day02;

import java.util.Scanner;

public class Ex06_If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력받은 값이 홀수인지 짝수인지 판단하시오.
		System.out.print("입력 : ");
		int input = sc.nextInt();

		// 홀수, 짝수 조건?
		// 1, 3, 5, 7... : 홀수 
		// 2, 4, 6, 8... : 짝수 
		// 1 % 2 = 1
		// 2 % 2 = 0
		// 3 % 2 = 1
		// 4 % 2 = 0
		// 5 % 2 = 1
		// 6 % 2 = 0
		if( input % 2 == 1 ) {
			System.out.println("홀수입니다.");
		}
		if( input % 2 == 0 ) {
			System.out.println("짝수입니다.");
		}
		
		sc.close();
	}
}
