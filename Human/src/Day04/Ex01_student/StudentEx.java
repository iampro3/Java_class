package Day04.Ex01_student;

public class StudentEx {

	public static void main(String[] args) {
		Student student = new Student();
		student.name = "김휴먼";
		student.age = 20;
		student.stdNo = "20230001";
		student.major = "컴퓨터공학과";		
		
		//student2 객체생성
		Student student2 = new Student("강재영", 20, "20230002", "경제학과");
	
		int[] scores = {10,20,30,40,50};
		int[] scores2 = {100,100,100,90,95};
		
		System.out.println("## 학생1 ##");
		System.out.println("학생1 - 이름 : " + student.name);
		System.out.println("학생1 - 나이 : " + student.age);
		System.out.println("학생1 - 학번 : " + student.stdNo);
		System.out.println("학생1 - 전공 : " + student.major);
		System.out.println("학생1 - 중간고사 점수 : " + student.getAverage(10,20));
		System.out.println("학생1 - 기말고사 점수 : " + student.getAverage(10,20,30));
		System.out.println("학생1 - 최종 점수 : " + student.getAverage(scores));
	
		System.out.println("## 학생2 ##");
		System.out.println("학생2 - 이름 : " + student2.name);
		System.out.println("학생2 - 나이 : " + student2.age);
		System.out.println("학생2 - 학번 : " + student2.stdNo);
		System.out.println("학생2 - 전공 : " + student2.major);
		System.out.println("학생2 - 중간고사 점수 : " + student2.getAverage(100,100));
		System.out.println("학생2 - 기말고사 점수 : " + student2.getAverage(100,90,95));
		System.out.println("학생2 - 최종 점수 : " + student2.getAverage(scores2));
	}	
}
