package Day08.Ex04_Time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAdjuster;

import Day05.Ex06_UpDownCasting.DownCasting;

public class DateTimeOperatitionEx {
	
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();		
		System.out.println("현재시간 : " + now);
		
		// +1년 +1개월 +1일 -3시간 -20분 -50초
		LocalDateTime targetTime = now.plusYears(1)
									  .plusMonths(1)
									  .plusDays(1)
									  .minusHours(3)
									  .minusMinutes(20)
									  .minusSeconds(50);
		System.out.println("변경시간 : " + targetTime);
			
		targetTime =now.withYear(1998)
					   .withMonth(2)
					   .withDayOfMonth(1)
					   .withHour(0)
					   .withMinute(30)
					   .withSecond(55);
					   
		System.out.println("태어난 시간 : " + targetTime);
		
		//년도
		targetTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("올 해의 첫 날 : " + targetTime);

		targetTime = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("올 해의 마지막 날 : " + targetTime);

		targetTime = now.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("다음해의 첫 날 : " + targetTime);

		targetTime = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이번 달의 첫 날 : " + targetTime);

		targetTime = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("이번 달의 마지막 날 : " + targetTime);

		targetTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("이번 달의 첫번쨰 월요일 : " + targetTime);

		targetTime = now.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("다음 토요일 : " + targetTime);

		targetTime = now.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY));
		System.out.println("지난 일요일 : " + targetTime);
	}
}
