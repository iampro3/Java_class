package Day08.Ex05_Text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {
	
	public static void main(String[] args) throws ParseException {	
		
		/*
		 * yyyy 4자리 년도  	yy : 2자리 년도
		 * MM 2자리 월, 		M : 1자리월
		 * D 올해의 몇 번째 일	d : 1자리일
		 * W 이번달의 몇 주차
		 * w 올해의 몇 주차
		 * E 요일
		 * a 오전/오후
		 * HH 시
		 * mm 분
		 * ss 초
		 */
	
	Date now = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat();	

	System.out.println( sdf.format(now) );
	
	String day = "2023/2/1";
	Date date = new SimpleDateFormat("yyyy/MM/dd").parse(day);
	sdf = new SimpleDateFormat("yyyy년 M월 dd일");
	System.out.println( sdf.format(now) );
	
	sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a HH:mm:ss"); // a소문자 : 오전
	System.out.println( sdf.format(now) );

	sdf = new SimpleDateFormat("yyyy:M:dd(E)");
	System.out.println( sdf.format(now) );

	sdf = new SimpleDateFormat("올해 첫 날부터 D 번째 날");
	System.out.println( sdf.format(now) );
	
	sdf = new SimpleDateFormat("이번 달 첫날부터 d 번째 날");
	System.out.println( sdf.format(now) );
	
	sdf = new SimpleDateFormat("올해의 w주차 입니다");
	System.out.println( sdf.format(now) );

	sdf = new SimpleDateFormat("이번달의 w주차 입니다");
	System.out.println( sdf.format(now) );
	}
}
