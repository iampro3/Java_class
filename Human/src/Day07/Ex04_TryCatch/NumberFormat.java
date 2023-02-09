package Day07.Ex04_TryCatch;

public class NumberFormat {
	public static void main(String[] args) {		
	
	//"100" ""로 된 문자열 숫자, 정수타입 변환가능
	//"a100" 이런 문자열은 정수타입으로 변환불가
	String numberString = "100";
	String numberAndString = "a100";
	
	//Integer.parseInt("문자열숫자")
	//문자열 숫자를 int 타입 정수로 변환하는 메소드
	
	int num1 = Integer.parseInt(numberString);		//변환가능
	int num2 =0;
	//int num2 = Integer.parseInt(numberAndString);  //변환불가
	
	try {
		num2 = Integer.parseInt(numberAndString);
	}
	catch(NumberFormatException e) {
		System.err.println("문자열 숫자가 아닌 문자열은 숫자타입으로 변환할 수 없다.");
	}
	//numberFormatException : For input string : "a100"
	//문자열 숫자가 아닌 문자열은 숫자타입으로 변환할 수 없다.
	
	System.out.println("num1 : " + (num1+10));
	System.out.println("num2 : " + num2);
	}
}
