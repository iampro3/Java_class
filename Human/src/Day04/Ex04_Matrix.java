package Day04;


import java.util.Scanner;

public class Ex04_Matrix {
	public static void main(String[] args) {
		
		// ctrl + shift + f : 코드정리
		//양의 정수를 M과 N을 입력받아 저장하고
		//M행, N열의 2차원 배열을 생성한다.
		//각요소의 값을 입력받고, 그대로 출력하시오
		// M :2
		// N :3
		//입력예시
		// 1 2 3
		// 4 5 6
		//출력예시
		// 1 2 3
		// 4 5 6
		// M :3
		// N :4
		//입력예시
		// 1 2 3 4
		// 6 7 8 9
		// 10 11 12 13

		//같은 과정을 한 번 더, x행, y열로 입력받고 출력한다.
		Scanner sc = new Scanner(System.in);
		int M, N, X, Y;
		System.out.print("M : ");
		M= sc.nextInt();
		System.out.print("N:");
		N = sc.nextInt();

		int arr[][] = new int[M][N];	
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[1].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		//위와같이 X행Y열 2차원 배열을 생성하여 입력받고 출력하기		
		System.out.print("X : ");
		X= sc.nextInt();
		System.out.print("Y : ");
		Y = sc.nextInt();
		
		int arr2[][] = new int[X][Y];
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}			
		}
			for(int[] row : arr2) {
				for(int col : row) {
					System.out.print(col +"");
				}
				System.out.println();
			}				
		sc.close();
	}		
}
	
	
	

