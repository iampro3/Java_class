package com.instagram.Login;

public class Login {

	/**
	 * 필드
	 * 1단계 " human", pw :"1234"
	 * 2단계
	 * 배열로 여러 계정을 관리
	 */
	private String id = "human";
	private String pw = "1234";
	
	//"메인 페이지입니다" 출력만
	void goMain(String id)
	{
		System.out.println("메인 페이지입니다.");
		System.out.println(id +" 님 환영합니다.");
	}
	
	//전달받은 계정과 저장되어 있는 계정(들)과
	//일치하는 것이 있는 지 판단해서
	//결과를 돌려줌 : boolean : true/false
	private boolean loginCheck(String id, String pw) {
		// if 합치기 어려운 경우
		// 하나씩 만들어 나중에 합친다.
		//id 비교
		if(this.id.equals(id)) {	// 앞의 id는 field에서 선언한 id/ (id)는 loginCheck method의 매개변수 (String id) 
			System.out.println("id는 일치한다");
		}
		if(this.pw.equals(pw)) {
			System.out.println("pw는 일치한다");
		}
		
		boolean result = false;
		
		if( (this.id.equals(id)) && (this.pw.equals(pw)) ) {
			System.out.println("id와 pw는 모두 일치한다");
			//결과를 돌려움 1번째 방법
			//return true; // 변수에 담을 수 있다. 아래로 수정 위 boolean resutl에 담아 놓는다.
			
			result = true;
			
		}else {
			System.out.println("id와 pw는 모두 불일치 한다");
			//return false; 아래로 수정
			result = false;
		}
		System.out.println("점검결과: result :" + result);
		return result;
	}	
	
	//메소드 lginCheck를 호출해서
	//결과에 따라
	//참이면 goMain 실행
	//거짓이면 "계정이 없습니다."
	public void doLogin(String id, String pw) {
		boolean result = loginCheck(id, pw);
		if(result == true) {
			goMain(id);
		}else {
			System.out.println("계정이 없습니다.");
		}
	}
	
	
}
