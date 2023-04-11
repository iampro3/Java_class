package expert; 

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 2개, 3,4, 넣고 출력결과 1: " 3>4의 결과는ㄴfalse입니다.
		//		
		int a= 3;
		int b=4;
												//True 가 아니라 실제 결과를 ()안에 넣는다. 
		System.out.println(a + "> "+ b + "의 결과는 " +(a>b) +"입니다.");
		//a + " >" + b + "dml"
		a=5;
		b=6;
		System.out.println(a+ ">"+b+"의 결과는"+(a<b) +"입니다");
		//2번 : 주관식 : 저장할 수 있는 변수타입을 적기
		//2-1 나는 자동차를 소유하고 있다. : 참/거짓 true/false : boolean
		//2-2 우리집에 있는 스마트폰 갯수 :int
		//2-3 내 이름 : String
		//2-4 1평은 3.3 제곱미터입니다.
		
		
		/*
		 1번, 15와 20 의 숫자에서 세번째 값이 그 사이에 있는지 확인
		 
		 e는 15와 20사이 
		 15<= e <= 20
		 15<= e && e<=20
		 */
		int c =15;
		int d =20;
		//int e = 17; // 세번째 값
		//int e = -17; // 세번째 값
		int e = 20; // 세번째 값
		if(15 <= e&&e<=20) {
			System.out.println(" 사이에 있습니다");
//		}else if( !(15 <= e&&e<=20)) {
		}else if( (15 > e || e > 20)) {		// 작거나 같다(<=) -> 크다(>) / 20 작거나 같다 (<=) -> 크다(>)
			System.out.println("사이에 없습니다");
			/*
			 * 
			 * */
		}
		/*2번
		 * 사각형의 한쪽 모서리 : ㅌ1:10, ㅛ1:20
		 *  "     다른쪽 모서리:x2:90, y2:100
		 *  이 경우에 새로운 점 x3, y3이 사각형 안에 들어가는가?
		 * */
		int x1 =10, y1 =20, x2 =90, y2 =100;
		int x3 =50, y3 =50;		
		
		//for(int x=1, int y=2) -> 가능
		if( (x1<=x3 && x3<=x2) // x축 검사)
				&& (y1 <= y3 && y3 <= y2) ) { //y축 검사
			System.out.println("사각형에 포함됩니다");
		}else {
			System.out.println("사각형에 포함되지 않습니다");
			}
		}			 
	}

