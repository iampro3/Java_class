package Day02;

public class Ex14_WhileSum {
	
	public static void main(String[] args) {
		// 1부터 100까지의 합계를 구하시오.
		// 1+2+3+4+ ... + 100 = 5050
		int sum = 0;
		int a = 1;
		
		while( a <= 100 ) {
			// 복합 대입 연산자
			sum += a++;
//			sum = sum + a;	
//			a++;
		}
		System.out.println("합계 : " + sum);
	}
}
