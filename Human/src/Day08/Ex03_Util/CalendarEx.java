package Day08.Ex03_Util;

import java.util.Calendar;

public class CalendarEx {	

	public static void main(String[] args) {
		// Calendar : 날짜 및 시간을 다루는 클래스
		 
		Calendar calendar = Calendar.getInstance();
		System.out.println("오늘 날짜");
		System.out.print(calendar.get(calendar.YEAR) + "년");		//4자리 년도
		System.out.print(calendar.get(calendar.MONTH) + 1 + "월");	//0~11
		System.out.print(calendar.get(calendar.DATE) + "일");		//1~31
		System.out.println();
		
		System.out.println("현재 시간");
		System.out.print(calendar.get(Calendar.HOUR)+"시");
		System.out.print(calendar.get(Calendar.MINUTE)+"분");
		System.out.print(calendar.get(Calendar.SECOND)+"초");		
		
	}
}
