package com.instagram.Login;

public class LoginTest {

	static String id = "human";
	static String password = "1234"
			+ "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 내가 갖고 있는 id, pw를 login class에 전달하고
		 * 결과를 확인
		 */
		
		Login login = new Login();
		login.doLogin(id, password);
		System.out.println();
		
	}

}
