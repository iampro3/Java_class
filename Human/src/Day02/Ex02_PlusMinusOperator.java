package Day02;

public class Ex02_PlusMinusOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;
		
		// 증감연산자
		// ++a, a++		: a를 1 증가
		// --a, a--		: a를 1 감소
		
		// 후위연산자 		: 연산 우선순위 가장 낮다
		c = a++ + b;
		System.out.println("c = " + c);
		System.out.println("a = " + a);
		
		int answer = a++ + b  * (10 / 20) + (123 - 1238490) * 29;
		
		int x = 10;
		int y = 20;
		int z;
		
		// 전위연산자 		: 연산 우선순위가 가장 높다
		z = ++x + y;
		System.out.println("z = " + z);
		System.out.println("x = " + x);		
		
	}
}
