package Day07.Ex02_AnonymousObject;

public class AnonymousPerson {
	
	//익명 자식 객체 생성
	Person person1 = new Person() {
		void work() {
			System.out.println(name + "(" + age + ")");
			System.out.println("프로그래밍을 합니다");
			System.out.println();
		}		
	};
	
	Person person2 = new Person() {
		void work() {
			System.out.println(name + "(" + age + ")");
			System.out.println("요리를 합니다");
			System.out.println();	//마지막 한 칸 띄우기
		}
	};
	
	void method() {
		person1.name = "김휴먼";
		person1.age = 20;
		person1.work();
		
		person2.name = "백종원";
		person2.age = 40;
		person2.work();
	}
}
