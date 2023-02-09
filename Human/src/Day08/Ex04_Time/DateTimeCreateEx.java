package Day08.Ex04_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;

public class DateTimeCreateEx {	

	public static void main(String[] args) {
		
		//LocalDate : 날짜를 다루는 클래스
		LocalDate nowDate = LocalDate.now();
		System.out.println("현재 날짜 : " + nowDate);
		
		LocalDate endDate = LocalDate.of(2023,7,21);
		System.out.println("종 료날짜 : " + endDate);
		
		
		//LocalTime : 시간을 다루는 클래스
		LocalTime nowTime = LocalTime.now();
		System.out.println("현재 시간 : " + nowTime);

		//LocalTime.of(시간, 분, 초 , 나노초)
		LocalTime endTime = LocalTime.of(17,40,0,0);
		System.out.println("종료 시간 : " + endTime);
		
		//LocalDateTime : 날짜와 시간을 다루는 클래스
		LocalDateTime nowDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간 : " + nowDateTime);		
		
		LocalDateTime endDateTime = LocalDateTime.of(2023, 7, 21, 17, 40, 0, 0);
		System.out.println("종료 날짜와 시간 : " + endDateTime);
		
		//협정세계시와 타임존(TImezone)
		//UTC : 협정 세계시 = 국제표준시
		//서울 : Asia/Seoul
		//뉴옥 : Anerica/New York
		//일본 : Japan
		//로마 : Europe/Rome
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시 : " + utcDateTime);
		
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("서울 표준시 : " + seoulDateTime);

		ZonedDateTime NewYorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕 표준시 : " + NewYorkDateTime);

		ZonedDateTime japanDateTime = ZonedDateTime.now(ZoneId.of("Japan"));
		System.out.println("일본 표준시 : " + japanDateTime);

		ZonedDateTime romeDateTime = ZonedDateTime.now(ZoneId.of("Europe/Rome"));
		System.out.println("로마 표준시 : " + romeDateTime);

		//윤년
		//2dnjf29일
		LocalDate ld = LocalDate.now();
		//LocalDate객체.isLeapYerar();
		
		if(ld.isLeapYear()) {		//LocalDate 줄여서 ld로 씀
			System.out.println("올해는 윤년 : 2워29일");
			System.out.println();
		} else{
			System.out.println("올해는 평년이다");		
			System.out.println();
		}
		
		String[] timeZoneId = TimeZone.getAvailableIDs();
		
		for(String ZoneId : timeZoneId) {
			System.out.println(ZoneId);
		}		
	}
}
