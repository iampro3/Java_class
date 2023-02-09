package Day07.Ex08_UserExceprion;


//사용자 정의 예외 클래스
//public class - Exceprion extends Exception()
public class BalanceException extends Exception {
		public BalanceException() {}
		public BalanceException(String message) {
			super(message);
			
		}
}
