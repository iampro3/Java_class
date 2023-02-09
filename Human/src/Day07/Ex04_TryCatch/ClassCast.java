package Day07.Ex04_TryCatch;

class Animal {}

class Dog extends Animal{}

class Cat extends Animal{}

public class ClassCast {
	//Dog, Cat - Animal
	//Animal = Cat 경우는 다시 Dog로 변환 불가
	//Cat를 Dog로 타입변환할 수 없다.
	public static void changeDog(Animal animal) {
		try {
		Dog dog = (Dog) animal;
		}
		catch(ClassCastException e) {
			System.err.println("Cat을 Dog로 변환할 수 없습니다.");
		}
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);	//cat이 전달된 경우, DOG로 변환 불가
	}
}
