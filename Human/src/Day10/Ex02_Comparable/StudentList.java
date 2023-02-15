package Day10.Ex02_Comparable;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StudentList {
	public static void main(String[] args) {
		List<Student> studentList = new LinkedList<>();
		
		Student s1 = new Student("김휴먼", 20,1);
		Student s2 = new Student("안휴먼", 45,2);
		Student s3 = new Student("조휴먼", 25,3);
		Student s4 = new Student("정휴먼", 32,4);
		Student s5 = new Student("이휴먼", 39,5);
		Student s6 = new Student("박휴먼", 42,6);
		Student s7 = new Student("전휴먼", 54,7);
		Student s8 = new Student("고휴먼", 28,8);
		Student s9 = new Student("배휴먼", 35,9);
		Student s10 = new Student("민휴먼", 28,10);
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		studentList.add(s7);
		studentList.add(s8);
		studentList.add(s9);
		studentList.add(s10);
		//이름순
		Collections.sort(studentList);
		
		for (Student student : studentList) {
			System.out.println(student.name + " : " + student.age + " : " + student.grade);
		}
	}
}
