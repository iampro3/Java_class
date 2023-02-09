package Day08.Ex03_Util;

import java.util.Calendar;

public class CalendarPrint {
	public static void printCalendar(String msg, Calendar cal){
	
	
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		
		System.out.println(msg + year + "/" + month + "/" + day + "/");
		
		String Day = "";
		switch(dayOfWeek) {
			
		case Calendar.SUNDAY: Day = "일요일"; break;
			case Calendar.MONDAY: Day = "월요일"; break;
			case Calendar.TUESDAY: Day = "화요일"; break;
			case Calendar.WEDNESDAY: Day = "수요일"; break;
			case Calendar.THURSDAY: Day = "목요일"; break;
			case Calendar.FRIDAY: Day = "금요일"; break;
			case Calendar.SATURDAY: Day = "토요일"; break;
		
		}
		System.out.print(Day);
		System.out.print("(" + hourOfDay + "시 ");
		if( ampm == Calendar.AM)
			System.out.println("오전");
		if( ampm == Calendar.PM)
			System.out.println("오후");
		System.out.println(hour + "시 " + minute + "분 " + second + "초 " + millisecond + " 밀리초 " );
	}	
	

	public static void main(String[] args) {
		//2023년 2월9일 PM 4시00분 ...
		Calendar now = Calendar.getInstance();
		printCalendar("현재 ", now);
		
		Calendar test = Calendar.getInstance();		
		test.set(2023, Calendar.MARCH, 14);
		printCalendar("다음일정 ", test);		
	
		
		Calendar lastDay = Calendar.getInstance();
		lastDay.set(2023, Calendar.JULY, 21);
		
		long nowT = now.getTimeInMillis() / (1000*60*60*24);
		long lastT = lastDay.getTimeInMillis() / (1000*60*60*24);
		System.out.println("1970년 1월1일~오늘까지 일수 :" + nowT); //
		System.out.println("1970년 1월1일~종강까지 일수 :" + lastT); //
		System.out.println("D-Day : " + (lastT - nowT) + "일"); // 			
		
	}
}

