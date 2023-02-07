package Day06.Ex01_Shape;

public class Ractangle extends Shape { // extends 입력 후, ractangle에 빨간 밑줄생기면 Add implement 누르기
	//변수선언
	
	double width, height;
	
	public Ractangle(double width, double height){
		this.width = width;
		this.height = height;
		
	}
	//오버라이딩
	@Override
	double area() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	double round() {
		// TODO Auto-generated method stub
		return width *4;
	}
	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + "]";
	}
	
	
}
