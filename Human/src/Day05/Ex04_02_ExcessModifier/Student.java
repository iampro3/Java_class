package Day05.Ex04_02_ExcessModifier;

import Day05.Ex04_01_ExcessModifier.Person;

// import ? 

public class Student extends Person{

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int height, int age, int weight) {
		super(name, height, age, weight);
		// TODO Auto-generated constructor stub
	}
	
	public void defaultSetting() {
		name ="이름없음";
		height = 174;
//		age = 20;
//		weight = 60;
		setAge(20);
		setWeight(60);
	}
}
