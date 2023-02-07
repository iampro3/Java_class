package Day03;


public class Ex04_foreach {
	public static void main(String[] args) {
		
	String []week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
	
	for (int i = 0; i < week.length; i++) {
		System.out.print(week[i] + " ");
	}
	System.out.println();
	
	//foreach : ctrl + space
	//foreach문
	// 배열 또는 
	for(String day : week) {
		System.out.print(day + " ");
	}
	System.out.println();
}
}
