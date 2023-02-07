package Day06.Ex01_Shape;

//Shape 클래스를 구현하시오.
//shape 클래스를 상속받아 추상메소드를 오버라이딩 하시오
public class Triangle extends Shape{

	
	//변수지정
	double width, height;
	//생성자
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		//가로 * 세로/2
		return width * height /2;
	}

	@Override
	double round() {
		// TODO Auto-generated method stub
		
		//정삼각형 : 한 변의 길이 *3
		return width *3;
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
	
	
}
