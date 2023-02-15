package Day02;

public class Ex19_GuguAll {
	
	public static void main(String[] args) {
		// (단)x(1~9)
		// 단에 대한 반복 	: 1~9
		// 각 단에 곱		: 1~9
		
		// A x B 
		// i : 단 (A)
		for (int i = 1; i <= 9; i++) {
			// i : 1
			// j : 곱 (B)
			for (int j = 1; j <= 9 ; j++) {
				// i : 1
				// j : 1 2 3 4 5 6 7 8 9
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.print("\t");		// 탭
			}
			// 1*1=1	1*2=2	1*3=3  ... 1*9=9
			System.out.println();	// 한 단 끝 --> 다음줄로
		}		
	}
}
