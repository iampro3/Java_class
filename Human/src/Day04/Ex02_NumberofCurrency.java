package Day04;

import java.util.Scanner;

/**
 * 화폐매수 구하기
 * 금액 : 534760
 * 10000 : 10개
 * 5000 : 10개
 * 500 : 10개
 * 100 : 10개
 * ...
 * 1 : 10개
 * 큰 화폐매수부터 입력
 * 
 * @author iii
 *
 */
public class Ex02_NumberofCurrency {
	
		/*
		 순서도
		 1. 필요변수 선언:입력금액, 화폐매수, 화폐단위
		 2, 입력금액 입력
		 3. 화폐매수 계산
		 	조건: 큰 화폐단위부터 계산하다.
		 	3-1. 화폐매수 계산 (화폐매수) = (입력금액) / 화폐단위
		 	                 10     537620  / 50000    
		 	3-2. 잔액 계산
		 		   잔액 = 입력금액 % 화폐단위
		 	3-3 화폐단위 변환
		 	50000
		 	10000
		 	5000
		 	1000
		 		번갈아가면서, /5, /2 연산을 반복한다.
		 		화폐단위 = 화폐단위 /5
		 		화폐단위 = 화폐단위 /2
	 		4. 3번의 과정을 반복
	 			반복조건 : (화폐단위) 1보다 크거나 같으면 반복
	 			
		 	
		 */
		public static void main(String[] args) {
		
		int input;  // 입력금액
		int count;	//화폐매수
		int money = 50000;	//화폐단위 : 큰 화폐단위부터 시작
		boolean sw = true;
		
		System.out.print("금액 : ");
			
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		
		while(money >=1) {
			count = input/money;
			System.out.println(money + "\t : " +count + "개");
			input = input % money ;
		
			if(sw) {
				money = money/5;
			} else {
				money = money/2;
		}
		sw = !sw;
		sc.close();
	}
}
}
