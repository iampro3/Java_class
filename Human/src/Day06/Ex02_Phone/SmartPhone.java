package Day06.Ex02_Phone;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);		
	}

	//재정의
	@Override
	public void turnon() {
		System.out.println("전원을 켭니다.");	
	}

	@Override
	public void turnoff() {
		System.out.println("전원을 끕니다.");	
	}
	
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}	
	
}
