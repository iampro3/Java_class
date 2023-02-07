package Day03;

import java.util.Scanner;

public class Ex07_Zigzag {
	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);		
		int N = sc.nextInt();
		
		int arr[][] = new int[N][N];
		
		int k=1;	//증가하는 수
		int sw = 1; //방향 전환 수 정방향:역방향
		
		for (int i = 0; i < arr.length; i++) {
			
			//정방향
			if (sw ==1 ) {
				//안쪽반복문 :J열
				for (int j = 0; j < N; j++) {
					arr[i][j] = k++;				
				}	
				//sw = -1	;	//방향전환		
			}
			
			//역방향
			if (sw == -1 ) {
				for (int j = N-1; j >= 0; j--) {
					arr[i][j] = k++;
				}
				//sw = 1;
			}
			sw *= -1;
		}	
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");						
			}
			System.out.println();		
		}		
	
		sc.close();
	}
}
