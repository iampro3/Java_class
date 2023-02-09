package Day07.Ex04_TryCatch;

import java.util.Scanner;

public class IndexOutofBound {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열 요소의 개수");
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		System.out.println("접근할 index :");
		int index = sc.nextInt();
		System.out.println("입력할 값 :");
		int input = sc.nextInt();
		
		//예외 메시지 :
		//java.lang.ArrayIndexOutofBoundsException:
		//Index 5 out 
		try {
			arr[index] = input;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("배열 index의 범위를 초과하여 접근했습니다.");
			System.err.println("(0~" + (N+1) + ")사이의 정수 범위에서 입력해주세요");
		}
		sc.close();
	}
}
