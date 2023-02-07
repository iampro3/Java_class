package Day06.Ex02_Phone;

//공통된 특성을 추상 클래스에서 정의한다.
public abstract class Phone {
	
	//변수
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//추상메소드
	abstract public void turnon();
	abstract public void turnoff();
	
	
}
