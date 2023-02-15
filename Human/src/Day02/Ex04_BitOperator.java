package Day02;

public class Ex04_BitOperator {
	public static void main(String[] args) {

		//AND

		//20 (십진수) --> 0001 0100 (이진수)
		//16(십진수)
		//이진수 : 0 또는 1로만 표현한 수
		//0001 0100
		//0001 0000

		int result = 20&16;
		System.out.println(20&16);
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("----------------------");
		System.out.println(Integer.toBinaryString(result));
		System.out.println();

		//OR 한개라도 1(0)이면 1(0)
		//0001 0100
		//0001 0000
		//0001 0000
		int result2 = 20|16;
		System.out.println(20|16);
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("----------------------");
		System.out.println(Integer.toBinaryString(result2));
		System.out.println();
		//xor 

		//0001 0100

		//0001 0000

		int result3 = 20 ^ 16;
		System.out.println(20^16);
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("----------------------");
		System.out.println(Integer.toBinaryString(result3));
		System.out.println();

		//not / 0과 1이 서로 반대로 표기됨
		// ~0001 0100
		//----------------
		// 1110 1011
		int result4 = ~20;
		System.out.println(~20);
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("----------------------");
		System.out.println(Integer.toBinaryString(result4));
		System.out.println();
		//int (4byte) (32bit)

		// 0000 0000 0000 0000 0000 0000 0001 0100 // 앞에 6개 자리는 생략된다.

		// 1111 1111 1111 1111 1111 1111 1110 1011

		//시프트 연산

		//-산술 시프트(<<,>>)

		//부호 비트 유지하면서 왼쪽 또는 오른쪽으로 이동 시키는 연산자

		//-논리 시프트(<<<,>>>)

		//부호 비트 포함하여 전체를 왼쪽 또는 오른쪽으로 이동 시키는 연산자

		//0000 0010 - 2: 2^1
		//0000 0010 - 4: 2^2
		//0000 0010 - 8: 2^3
		System.out.println("<< 연산하면 2배씩 증가");
		System.out.println(2 << 1);
		System.out.println(2 << 2);
		System.out.println(2 << 3);
		System.out.println();
		System.out.println(">> 연산하면 1/2배씩 감소");
		System.out.println(16 >> 1);
		System.out.println(16 >> 2);
		System.out.println(16 >> 3);
		System.out.println();
		System.out.println("부호가 있는 경우");
		System.out.println(-2 << 1);
		System.out.println(-2 << 2);
		System.out.println(-2 << 3);
		System.out.println();
		System.out.println(2 >> 1);

		System.out.println(-2 >>> 31);

		System.out.println(Integer.toBinaryString(2));

		System.out.println(Integer.toBinaryString(-2));

		System.out.println();

		// 보수는 1을 더한다.

		// 0000 0000 0000 0000 0000 0000 0000 0010

		// 1111 1111 1111 1111 1111 1111 1111 1101 

		// 0000 0000 0000 0000 0000 0000 0000 0001

		//------------------------------------------

		// 1111 1111 1111 1111 1111 1111 1111 1110

		}
}
