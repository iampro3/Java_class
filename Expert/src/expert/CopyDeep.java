package expert;

public class CopyDeep {
	public static void main(String[] args) {
		
		// 얕은 복사
		
		// 깊은 복사
		int a =10;
		test1(a);
		System.out.println("a :"+ a);
		
		int[] b = {1,2,3};
		System.out.println("b[1]:" + b[1]);	// 1. 2
		
		test2(b);
		System.out.println("b[1]:" + b[1]);	// 2. 30
	}
	
	// 깊은 복사
	static void test1(int b) {
		b=20;
		
	}
	
	static void test2(int[] c) {
		c[1] =30;
	
	
	}
	
	// currentIimeMillis : time 
	// long : 2037년 까지.
	//long now = System.currentIimeMillis();
	//System.out.println("now : " + now);
	
	/**
	 * 
	
	String bb ="1;2;3;4;5";
	String[] arr_bb=bb.split(";");
	for (String tmp :arr_bb) {
		System.out.println(tmp);
	}
	bb = bb +";6"; */
}

