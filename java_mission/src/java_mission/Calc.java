package java_mission;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int oddSum =0;
		int evenSum =0;
		
		for(int i = 1; i <= N; i+=2) {
			
			oddSum += i;
			System.out.print(i);
			if(i>= N-1) System.out.print("=");
			else  System.out.print("+");
		}
		System.out.println(oddSum);
		sc.close();
	}
}
