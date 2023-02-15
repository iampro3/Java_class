package Day02;

public class Ex17_For {
	
	public static void main(String[] args) {
		// for( ①초기식 ; ②조건식 ; ④증감식 ) { ③실행문; }
		// 실행 순서 : ① → 반복(② → ③ → ④)
		// 1. 1~10 까지의 정수를 출력하시오.
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 2. 50~100까지의 정수를 출력하시오.
		for (int i = 50; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 3. 1~20까지의 정수 중, 짝수만 출력하시오.
		// 2 4 6 ... 20
		for (int i = 2; i <= 20; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 4. 1~20까지의 정수 중, 홀수만 출력하시오.
		for (int i = 1; i <= 20; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();		
	}
}
