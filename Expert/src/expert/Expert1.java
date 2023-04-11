package expert;

public class Expert1 {

	public static void main(String[] asdf) {			
	
		System.out.println("Hello World");
		
		int a= 10;
		System.out.println("a:"+a);
		{
			int b =20;
			System.out.println("a2:"+a);
		}
		{
			// 이미 선언된 a에 영향맏아 다시 a 변수를 선언하지 못함			
			//int a =50;
			// 영향을 미치는 변수 b가 없으므로 사용 가능
			int b =30;
			System.out.println("b2:"+b);
		}
		//System.out.println("b:"+b);
		// 반응형
		//320이하에서는 width값을 300px로 고정
		//770이상 1000px
		int vw = 500;
		int width =0;
		switch(vw) {
		case 250:
			//width = 300;	// 생략가능
			//break;		// "
		case 300:
			width = 300;
			break;
		case 700:
			width = 500;
			break;
		case 1000:
			width = 1000;
			break;
			// break 문은 다음 case 문에 연결되면 생략가능
		}
			// 1단계 : 몇 개만 적기
			// 2단계 : 반복되는 것/ 반복되지 않는 것
			System.out.println("2*1=2");
			System.out.println("2*2=4");
			System.out.println("2*3=6");
			System.out.println("2*4=8");
			System.out.println("2*5=10");
			System.out.println("2*6=12");
			// 3 단계 : 반복되지 않는 것의 패턴을 파악
			// 4 단꼐 : 시작조건, 종료조건(종료조건을 정하기 어렵다)
			// 종료조건이 명확하면(숫자) : for
			// while : 언제끝날지 명확하지 않음
			
			//i+=1;
			//i++;
			
			for(int i=1; i<9;i=i+1) {
				System.out.println("2"+ "x" + i +"="+(2*i));
				
			}
			for(int j=1; j<=9 ; j++) {
				for(int i=1;i<=9; i++) {
				System.out.println(j +"x"+ i + "=" + j*i);
				}
			}
			// 0<= x<1
			double x =Math.random();
			// 0* 45 <= x* 45 <1 * 45
			// 0 < = x * 45 +1 < 45 + 1
			// 1 < = x * 45 +1 < 46
			int lotto1 = (int)((x * 45)+1);	// 뒤의 +1은 시작 값이다.
			System.out.println("lotto1 :" + lotto1);
			
			int lotto2 = (int)(x * 10000);
			lotto2 = (lotto2 % 45) + 1;
			System.out.println("lotto2 :" + lotto2);
	}	
}


