package Day03;

import java.util.Scanner;

public class Ex06_Arrays {
	
	public static void main(String[] args) {
	//2행 3열로 배열 생성
		//[][][]
		//[][][]
		
		//비정방 행렬 배열
		//[][]
		//[][][][]
		//[][]
		int [][] a = new int[3][];
		//
		a[0] = new int[2]; // 1,2
		a[1] = new int[4];	//1,2,3,4
		a[2] = new int[3];	//1,2,3
		
		//  입력
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();					
			}
		}			
		
		//출력
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+ " ");					
			}
			System.out.println();
		}		

		sc.close();				
	}
}
