package Day09.BookStore;
/*
 * 장바구니
 */
public class Cart {
	// 책의 정보
	// 책 id : ISBN
	// 수량 
	// 책의 총 가격
	private String[] bookInfo;
	private String bookID;
	private int count;
	private int totalPrice;
	
	//기본생성자
	public Cart() {
	}
	
	public Cart(String[] bookInfo) {
		this.bookInfo = bookInfo;
		this.bookID = bookInfo[0];
		this.count = 1;
		//this.totalPrice = count * Integer.parseInt(bookInfo[2]);
		updateTotalPrice();	//수량이 변경될 때, 총 가격 다시 계산
	}
	
	// 책의 정보 getter,setter
	public String[] getBookInfo() {
		return bookInfo;
	}

	public void setBookInfo(String[] bookInfo) {
		this.bookInfo = bookInfo;
	}

	// getter,setter
	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
		updateTotalPrice();	//수량이 변경될 때, 총 가격 다시 계산
	}

	public int getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}	
	
	public void updateTotalPrice() {
		this.totalPrice = count * Integer.parseInt(bookInfo[2]); // Integer.parseInt 로 count와 bookInfo의 값을 맞춰준다.
	}
}
