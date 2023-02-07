package Day04.Class;

//상속
//키워드 : 자식클래스 extends 부모클래스{}
public class Raichu extends Pikachu{
	
	// 생성자 자동완성
	// alt + shift + s->c
	public Raichu() {
		super(200, "슈퍼전기");		
	}

	public Raichu(int energy, String type) {
		super(energy, type);		
	}

	// 메소드 오버라이딩
	//오버라이딩 자동완성 alt +shift + s ->v
	@Override
	public String aAttack() {		
		return "백만볼트";
	}

	@Override
	public String bAttack() {		
		return "볼트체인지";
	}		

}
