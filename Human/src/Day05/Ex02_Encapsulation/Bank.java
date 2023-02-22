package Day05.Ex02_Encapsulation;

public class Bank {
	public static void main(String[] args) {
		Encapsulation ec
			= new Encapsulation(0, "국민은행", "200302-204022-12", "김휴먼");
			
		ec.setDeposit(10000000);
		
		int money = ec.getDeposit();
		System.out.println(ec);
		System.out.println("계좌잔액 : " + money);
	}
}
