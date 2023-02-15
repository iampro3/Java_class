package Day04.Ex03_Car;



public class CarEx {
	public static void main(String[] args) {
		
		// 객체생성
		Car car = new Car();
		car.model = "제네시스";
		// car.speed = 100;
		// private 변수라서, speed 에 접근이 불가능
		car.setSpeed(100);
		
		System.out.println("speed : " + car.getSpeed());
		
	}
}
