package Day10.Ex02_Comparable;

import java.util.Collections;
import java.util.LinkedList;

public class PersonList {
	public static void main(String[] args) {
		Person p1 = new Person("김휴먼", 44);
		Person p2 = new Person("정에듀", 34);
		Person p3 = new Person("이이영", 29);
		Person p4 = new Person("박하나", 48);
		Person p5 = new Person("주지훈", 52);
		
		LinkedList<Person> personList = new LinkedList<>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		personList.add(p5);		
		
		//Person 객체에 구현한 compareTo() 메소드의 비교기준으로 정렬된다.
		Collections.sort(personList);
		
		for (Person person : personList) {
			System.out.println(person.name + " : " + person.age);
		}
	}
}
