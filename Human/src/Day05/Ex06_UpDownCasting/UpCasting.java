package Day05.Ex06_UpDownCasting;

public class UpCasting {
	public static void main(String[] args) {
		//업캐스팅 : 자동타입 변환 
		// 부모클래스 = 자식클래스
		Person person = new Student("김휴먼", 20, 1,"뮤지컬학과");
		// Person : name,age
		// Student : name, age, grade, major
					
		System.out.println("name : " + person.name);
		System.out.println("age : " + person.age);
		//person 객체에서는 grade, major 변수를 접근할 수 없다.
		//System.out.println("grade : " + person.grade);
		//System.out.println("major : " + person.major);
		
		//클래스를 업캐스팅하면, 변수는 부모클래승에 있는 변수만 접근 가능하고
		//메소드는 자식클래스의 메소드가 우선하여 실행된다.
		
		//바인딩(Binding) : 프로그램에 사용되는 요소에 실제값을 결정짓는 행위
		// 정적바인딩 : 컴파일 시간에 결정, (부모클래스의)변수 등
		// 동적바인딩 : 실행 시간에 결정, {자식클래스의 메소드가}오버라이딩
		System.out.println(person);
		
		// 자식클래스의 work 메소드를 호출한다. *업캐스팅 : (부모클래스) = (자식클래스)
		System.out.println(person.work());
		
		
	}
}