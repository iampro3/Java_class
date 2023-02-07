package Day06.Ex01_Shape;

public class Circle extends Shape{
	//변수선언
	double radius;
	
	//생성자(매개변수)
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	double area() {
		//원주율 * 반지름 * 반지름
		return Math.PI * radius * radius;
	}

	@Override
	double round() {		
		// 2* 원주율 * 반지름
		return 2* Math.PI * radius;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}	
	
	
}
