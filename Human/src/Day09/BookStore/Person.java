package Day09.BookStore;

public class Person {
	private String name;	//	이름
	private String tel;		// 	전화번호
	private String adress;	// 주소	
	
	// 생성자
	public Person() {
	}
	
	public Person(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public Person(String name, String tel, String adress) {
		this.name = name;
		this.tel = tel;
		this.adress = adress;
	}

	// getter/setter 값을 가져오는, 지정하는 기본 메소드
	public String getName() {
		return name;
	}


	public String getTel() {
		return tel;
	}


	public String getAdress() {
		return adress;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	

	
}
