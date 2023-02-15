package Day11.Ex01_Generic;

class Cloth{}
class Product1{
private Cloth cloth = new Cloth();

	public void setCloth(Cloth cloth) {
		this.cloth=cloth;		
	}	
}

class Car{}
class Product2{
	private Car car = new Car();
	
	public Car getCar() {
		return car;
	}
	
	public void setCar(Car car) {
		this.car = car;
	}
}


public class NoGeneric {
	public static void main(String[] args) {
		Product1 product1 = new Product1();
		product1.setCloth(new Cloth());
		System.out.println(product1.getClass());
		
		Product2 product2 = new Product2();
		product2.setCar(new Car());
		System.out.println(product2.getCar());
		
		
		//클래스를 정의할 때, 타입이 이미 결정됨
		//product1 <--Car :불가능
		//product2 <--Cloth :불가능
		//product1.setCloth(new Car()); //불가능
		//product2.setCar(new Cloth()); 	//불가능
	}
	
}