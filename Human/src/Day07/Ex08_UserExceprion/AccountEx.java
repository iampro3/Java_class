package Day07.Ex08_UserExceprion;

public class AccountEx {
	
	public static void main(String[] args) {
		Account account = new Account();
		//10000입금
		account.deposit(10000);
		
		//20000 출금
		try {
			account.withdraw(20000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
