package Day06.Ex01_Shape;

//abstract: 추상클래스/메소드를 지정하는 키워드
public abstract class Shape {

	Point point;
	//넓이와 둘레를 구하는 메소드의 원형정의 : 
	//추상메소드 정의 : {}:중괄호 블록없이 메소드 원형만 정의하고 
	//자식클래스에서 반드시 오버라이딩해야만 사용할 수 있다.
	//형식 ; abstract 반환타입 메소드명(매개변수);
	abstract double area();		//넓이
	abstract double round();	//둘레	
	
	//getter,setter
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}	
	
}
