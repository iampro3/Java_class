package Day11.Ex02_WildCard;

import java.util.Arrays;

public class WildCardEx {
	
	//수강생들이 교육과정(Course)에 수강 등록을 합니다.
	
	//전체 이용가능 강의 
	public static void joinCourse(Course<?> course) { //? 와일드카드타입으로 정의
		System.out.println(course.getName() + "수강생");
		System.out.println(Arrays.toString(course.getStudents()));
		
	}
	//학생 전용 강의 
	public static void joinCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생");
		System.out.println(Arrays.toString(course.getStudents()));
	}
	
	//직장인 전용 가능 강의 
	public static void joinCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생");
		System.out.println(Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] agrs) {
		Course<Person> personCourse = new Course<>("일반인 과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<>("학생과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new Student("학생"));
		
		Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 5);
		highStudentCourse.add(new HighStudent("고등학생"));
		
		//일반과정에 수강등록
		joinCourse(personCourse);
		joinCourse(workerCourse);
		joinCourse(studentCourse);
		joinCourse(highStudentCourse);
		System.out.println();

		//학생과정에 수강등록
		//joinCourseStudent(personCourse);
		//joinCourseStudent(workerCourse);
		joinCourseStudent(studentCourse);
		joinCourseStudent(highStudentCourse);
		System.out.println();
		
		//직장인과정에 수강등록
		joinCourseWorker(personCourse);
		joinCourseWorker(workerCourse);
		//joinCourseWorker(studentCourse);
		//joinCourseWorker(highstudentCourse);
		System.out.println();
	}	
}
