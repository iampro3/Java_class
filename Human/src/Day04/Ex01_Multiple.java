package Day04;

import java.util.Scanner;

public class Ex01_Multiple {

	public static void main(String[] args) {		

	//정수 하나를 받아서 입력받은 수가 3의 배수인지 판단하고 그 여부출력
	//3의 배수이면 0 : "3의 배수입니다."
	//3의 배수이면 x : "3의 배수가 아닙니다."
	
	Scanner sc = new Scanner(System.in);
	System.out.print("입력 : ");
	int N = sc.nextInt();
	
	if(N != 0&& N%3 ==0)
		 System.out.println("3의 배수 입니다.");
	else {
		System.out.println("3의 배수가 아닙니다.");
	}
	
	sc.close();
	}
}
