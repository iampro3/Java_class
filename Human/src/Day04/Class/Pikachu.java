package Day04.Class;

//classification(분류) --> class
public class Pikachu {
	
	//클래스 : 객체를 정의하는 설계도
	//멤버  : 변수, 메소드
	// 변수
	public int energy;
	public String type;
	
	// 기본생성자 : 객체 생성 시 호출된다.
	public Pikachu() {
		this(100, "전기");	// 생성자에서 다른 생성자르 호출하는 메소드
		//	energy = 100;
		//	type = "전기";
	}

//	// 매개 변수가 있는 생성자
//	public Pikachu(int energy, String type) {
//		//this  객체 자신을 가리키는 레퍼런스.
//		this.energy = energy;
//		this.type = type;
//	}
	
	// 생성자 자동완성
	// alt + shift + s ->0 : 체크 -> omit call to ~~체크-> generate
	// 메소드(생성자) 오버로딩 -"메소드 중복정의"
	public Pikachu(int energy, String type) {
		this.energy = energy;
		this.type = type;
	}
	
	// 메소드
	//접근지정자 반환타입 메소드명(매개변수){}
	public String aAttack() {
		return "십만볼트";
	}

	public String bAttack() {
		return "전광석화";
	}	
}
