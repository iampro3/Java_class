package Day10.Ex02_Comparable;

public class Student implements Comparable<Student> {
	String name;
	int age;
	int grade;
	
	//생성자 
	public Student() {
	}
	
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getGrade() {
		return grade;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}

	@Override
	public int compareTo(Student o) {
		//학생을 나이순으로 정렬 - 오름차순
		String thisName = this.getName();		//해당객체의 이름
		String compName = o.getName();			//비교객체의 이름
		int gap = thisName.compareTo(compName);
		//해당객체이름.compareTo(비교객체 이름)
		//- 해당객체 > 비교객체 : 양수
		//- 해당객체 = 비교객체 : 0
		//- 해당객체 < 비교객체 : 음수
		
		if(gap ==0) return 0;
		else if(gap<0)return -1;
		else return 1;						
		
	}
	
}
