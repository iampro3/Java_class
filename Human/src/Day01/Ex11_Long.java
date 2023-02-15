package Day01;

public class Ex11_Long {

	public static void main(String[] args) {
		
		// int (4byte : 32bit ) : 2^32개: 42억개
		// int 수 표현 범위 : -21억xxx ~ 21억 xxx
		// int intMax = 2200000000;
		long ln1 = 1000; //(long) = (int)
		long ln2 = 2100000000; //(long) = (int)
		// long type 타입 리터럴 : 숫자+ 'L' 붙이기
		
		long ln3 = 2200000000L; 
		int max = Integer.MAX_VALUE; // int 형의 최댓값 (21억xxx)
		int min = Integer.MIN_VALUE; // int 형의 최솟값 (-21억xxx)
		System.out.println("int의 최댓값 : " + max);
		System.out.println("int의 최솟값 : " + min);
		System.out.println("ln1 : " + ln1);
		System.out.println("ln2 : " + ln2);
		System.out.println("ln3 : " + ln3);	
	}
}