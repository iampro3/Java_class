package Day05.Ex04_01_ExcessModifier;

public class Person {
	//이름, 키 나이, 체중
	public String name; // pu
	protected int height; // protected : 같은 패키지 + 다른 패키지의 자식 클래스에서 가능 , default : 패키지에서 접근
	int age; //default
	private int weight;//private
	
	// 생성자
	public Person() {
		
	}
	
	public Person(String name, int height, int age, int weight) {
		this.name = name;
		this.height = height;
		this.age = age;
		this.weight = weight;
	}

	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}	
	
	
	

	
}
