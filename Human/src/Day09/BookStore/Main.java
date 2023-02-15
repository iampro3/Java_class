package Day09.BookStore;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	//책의 개수, 책의 속성 개수
	static final int BOOK_COUNT = 3;
	static final int BOOK_ITEM = 7;
	//장바구니 목록, 장바구니에 담긴 개수
	static Cart[] cartList = new Cart[BOOK_COUNT];
	static int cartCount = 0;
			
	public static void main(String[] args) {
		
		//도서목록을 저장할 2차원 배열 생성
		String[][] bookList = new String[BOOK_COUNT][BOOK_ITEM];

		Scanner sc = new Scanner(System.in);
		//이름과 연락처 입력
		System.out.print("이름 : ");
		String userName = sc.next();		
		System.out.print("연락처 : ");
		String tel = sc.next();	
		
		Person person = new Person(userName, tel);		//고객정보 객체
		
		boolean end = false;	//종료여부 (true 종료) false 종료안함
		while(!end) {			//조건식이 true --> 반복
			
			//메뉴 출력
			showMenu();
			
			int menuNo = 0;
			//잘못 입력 시 예외 처리
			try {
				menuNo = sc.nextInt();
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.err.println("(0~7) 사이의 숫자를 입력하세요.");
				continue;	// 다시 입력하도록 반복문 처음으로 돌아감			
			}catch(Exception e){
				System.err.println("알 수 없는 오류로 프로그램을 종료합니다.");
				break;
			}
			System.out.println(menuNo + "번 메뉴를 선택!");
			
			//유효한 메뉴 번호 검사
			if( menuNo < 0 || menuNo > 7) {
				System.out.println("(0~7) 사이의 숫자를 입력하세요.");
				continue;
			}
			
			switch(menuNo) {
			case 1:				
//				guestInfo(userName, tel);
				guestInfo(person);
				break;
			case 2:
				System.out.println("장바구니 목록");
				cartList();		// 장바구니 목록을 선택하면 cartList 목록이 보여진다. 메소드를 호출
				break;
			case 3:
				System.out.println("장바구니 비우기");
				cartClear();
				break;
			case 4:
				System.out.println("장바구니 항목 추가");
				cartAdd(bookList);
				break;
			case 5:
				System.out.println("장바구니 수량 조절");
				cartSetCount();
				break;
			case 6:
				System.out.println("장바구니 항목 삭제");
				cartRemove();
				break;
			case 7:
				System.out.println("영수증 표시");
				printBill(person);
				break;
			case 0:
				System.out.println("*** 프로그램 종료 *** ");
				end = true;
				break;
			}//	switch 끝
		}//while 끝		
		//sc.close();	
	}//main 끝



	/*
	 *  메인 메뉴 출력
	 */
	public static void showMenu() {
		String welcome = "휴먼 서점에 오신 것을 환영합니다.";
		System.out.println("***************************");
		System.out.println("\t" + welcome);
		System.out.println("***************************");
		System.out.println("1. 고객정보 확인");
		System.out.println("2. 장바구니 목록");
		System.out.println("3. 장바구니 비우기");
		System.out.println("4. 장바구니 항목 추가");
		System.out.println("5. 장바구니 수량 조절");
		System.out.println("6. 장바구니 항목 삭제");
		System.out.println("7. 영수증 표시");
		System.out.println("0. 프로그램 종료");
		System.out.println("***************************");
		System.out.println(">> 메뉴번호 입력");	
	}
	
	/**
	 * 고객정보 학인
	 * @username
	 * @tel
	 */
	public static void guestInfo(Person person) {
		System.out.println("현재 고객 정보 : ");
		System.out.println("이름 : " + person.getName() + ", 연락처 :" + person.getTel());		
	}

	/*장바구니 목록
	 * 
	 */
	public static void cartList() {
		System.out.println("****** 장바구니 목록 ******");
		System.out.println("**********************");
		System.out.println("번호\t| ISBN  \t| 개수\t| 합계\t|");
		for (int i = 0; i < cartCount; i++) {
			System.out.print((i+1) + "\t|");
			System.out.print(cartList[i].getBookID() + "\t|");
			System.out.print(cartList[i].getCount() + "\t|");
			System.out.print(cartList[i].getTotalPrice() + "\t|");
			System.out.println();
		}
		System.out.println("**********************");
	}

	/*장바구니 비우기
	 * 
	 */
	public static void cartClear() {
		System.out.println("****** 장바구니 비우기 ******");
		
		//장바구니에 항목이 없을 때,
		if(cartCount == 0) {
			System.out.println("장바구니에 추가된 항목이 없습니다.");
			return;	// 메소드 종료 / return 타입이 void이다.
		}
		
		//장바구니의 모든 항목을 null로 지정(삭제)
		for (int i = 0; i < cartCount; i++) {
			cartList[i] = null;
		}
		//장바구니 항목 개수 0
		cartCount = 0;
		System.out.println("장바구니 목록을 비웠습니다.");
	}

	/*장바구니 항목추가
	 * 
	 */
	public static void cartAdd(String[][] bookList) {
		System.out.println("****** 장바구니 항목추가 ******");	
		bookList(bookList);	//도서목록확인
		
		//장바구니에 지정된 도서항목을 추가
		boolean end = false;
		while(!end) {
			System.out.print("장바구니에 추가할 도서 ISBN 입력 : ");
			Scanner sc = new Scanner(System.in);
			
			String input =sc.nextLine();
			boolean flag = false;		// 일치하는 도서가 있는지 여부
			int index = -1;
			
			for (int i = 0; i < bookList.length; i++) {
				//	bookList[i][0] : i번째 책의 ISBN
				if(input.equals(bookList[i][0])) {
					index = i;
					flag = true;	// 도서찾기 성공				
					break;
				}
			}
			//******************************************
			if(flag) {
				System.out.println("장바구니에 추가하겠습니까? (y/n)");
				input = sc.nextLine();	// Y or N 을 입력
				
				if(input.toUpperCase().equals("Y")) {
					//장바구니에 추가
					//booklist[index] : [ISBN0001][이것이 자바다]...[]
					//cartList[cartCount++] = new Cart(booklist[index]); // 아래와 동일
					String bookId = bookList[index][0]; // **********************
										
					int cartIndex= -1;
					//이미 장바구니에 담긴 책인가?  
					if(!isBookInCart(bookId)) {
						cartList[cartCount] = new Cart(bookList[index]);						
						cartIndex = cartCount; // 제일 처음 카트에 넣을 때는 0
						cartCount++;	// 장바구니 요소의 개수 +1 / 책이 장바구니에 추가되어야 하니, 한 개를 더 추가한다.
					} else {
						cartIndex = getCartIndex(bookId);
					}
					//메시지 출력
					String bookFormat = "\"{0}\"({1})- [{2}]";
					String title = bookList[index][1];
					int count = cartList[cartIndex].getCount();
					int totalPrice = cartList[cartIndex].getTotalPrice();
					
					String bookMsg = MessageFormat.format(bookFormat, title, count, totalPrice);
					System.out.println("책이 장바구니에 추가되었습니다.");					
					System.out.println(bookMsg);
					
				}				
				end = true;	// 장바구니 항목 추가 완료				
			}
			else {
				System.out.println("존재하지 않는 ISBN입니다.");
				System.out.println("다시 입력해 주세요");								
			}
		}//while 끝
	}

	/*장바구니 항목수량 조절
	 * 
	 */
	public static void cartSetCount() {
		System.out.println("****** 장바구니 수량 조절 ******");
		
		// 장바구니 목록
		cartList();

		Scanner sc = new Scanner(System.in);
		System.out.print("수량을 조절할 장바구니 번호 : ");
		int no = sc.nextInt();		//번호 입력
		
		if(no <= cartCount) {
			System.out.print("장바구니 항목의 변경할 수량 : ");
			int count = sc.nextInt();
			cartList[no-1].setCount(count);
			System.out.println("수량을 변경했습니다.");
			System.out.println(cartList[no-1].getBookInfo()[1] + "("+count +")");
		}
		else {
			System.out.println("장바구니 번호가 존재하지 않습니다.");
		}
	}
	
	/**
	 * 장바구니 항목수량 삭제
	 */
	public static void cartRemove() {
		System.out.println("****** 장바구니 항목삭제 ******");
		
		//장바구니에 항목이 없을 때,
		if(cartCount == 0)
		System.out.print("삭제할 장바구니 항목의 ISBN : ");
		Scanner sc = new Scanner(System.in);
		String bookId = sc.nextLine();
		
		Cart[] newCartList = new Cart[BOOK_COUNT];
		int	index = 0;

		boolean removed = false;
		for (int i = 0; i < cartCount; i++) {
			if( !bookId.equals(cartList[i].getBookID())){
				newCartList[index] = cartList[i];
				index++;
			}else {				
				removed = true;
			}
		}
		if(removed) {
			//해당항목을 장바구니에서 삭제했을 때,
			System.out.println(bookId + " 를 장바구니에서 삭제하였습니다.");
		} else {
			//해당항목이 장바구니에 없을 때,
			System.out.println(bookId + " 를 장바구니에 존재하지 않습니다.");
		}
		
		cartCount = index;
		cartList = newCartList;
	}
	
	/*프로그램 종료
	 * 
	 */
	public static void exit() {
		System.out.println("****** 프로그램 종료 ******");
	}
	
	/*
	 * 도서목록
	 * @param book
	 */
	public static void bookList(String[][] book) {		//2차원 배열에 도서정보 입력
		//ISBN, 제목, 저자, 간단소개, 카테고리, 가격, 발행일자
		book[0][0] = "ISBN00001";
		book[0][1] = "이것이 자바냐";
		book[0][2] = "35000";
		book[0][3] = "신용길";
		book[0][4] = "자바 프로그래밍에 모든 것";
		book[0][5] = "IT 전문서적";
		book[0][6] = "2018/01/01";		

		//ISBN, 제목, 저자, 간단소개, 카테고리, 가격, 발행일자
		book[1][0] = "ISBN00002";
		book[1][1] = "이순신";
		book[1][2] = "39000";
		book[1][3] = "김훈";
		book[1][4] = "바다위의 장수, 이순신의 생애";
		book[1][5] = "역사소설";
		book[1][6] = "2022/08/01";		
		
		//ISBN, 제목, 저자, 간단소개, 카테고리, 가격, 발행일자
		book[2][0] = "ISBN00011";
		book[2][1] = "반지의 제왕";
		book[2][2] = "55000";
		book[2][3] = "J.R.R 톨킨";
		book[2][4] = "판타지 전쟁과 역사속에서 부족과 천사, 우정의 뜨거운 활약";
		book[2][5] = "판타지 소설";
		book[2][6] = "2004/05/21";	
		
		
		for (int i = 0; i < book.length; i++) {
			for (int j = 0; j < book[i].length; j++) {
				System.out.print(book[i][j] + " | ");
			}
			System.out.println();
		}
	}
	// 장바구니의 상품 목록 확인	
	/**
	 * 장바구니에 책이 들어있는지 확인
	 * -이미 담겨져 있으면 수량을 1개 증가시키고 true를 반환
	 * -장바구니에 없으면 false를 반환
	 * @param bookId    //   /** 를 입력하면 "@" 누르고 "param" 사용가능함
	 * @return	 * 
	 */
	public static boolean isBookInCart(String bookId) {
		boolean flag = false;
		
		for (int i = 0; i < cartCount; i++) {
			//추가하는 책이 장바구니에 있으면,
			if(bookId.equals(cartList[i].getBookID())) {
				//현재 담기 책의 개수
				int nowCount = cartList[i].getCount();
				//장바구니에서 해당 책의 수량을 +1 증가
				cartList[i].setCount(nowCount+1);
				flag= true;	// 장바구니에 있으면 true
			}
		}
		// 이미 자바구니에 책이 있는지 여부를 반환한다.
		return flag;		
	}
	/**
	 *  장바구니 항복의  index를 반환하는 메소드
	 * @param bookId
	 * @return
	 */
	public static int getCartIndex(String bookId) {
		for (int i = 0; i < cartCount; i++) {
			if(bookId.equals(cartList[i].getBookID())) {
				return i;
			}
		}
		//book(ISBN)이 없으면 -1 반환
		return -1;
	}
	
	/**
	 * 영수증 표시
	 * @param person
	 */
	public static void printBill(Person person) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String day = sdf.format(date);		
		System.out.println();
		System.out.println("+++++++  주문한 고객정보 ++++++");
		System.out.println("고객명 : " + person.getName());
		System.out.println("연락처 : " + person.getTel());
		System.out.println("주소 : " + person.getAdress());
		System.out.println("주문일자 : " + day);
		System.out.println("+++++++  주문한 고객정보 ++++++");
		cartList();
		
		int sum =0;
		for (int i = 0; i < cartCount; i++) {
			sum += cartList[i].getTotalPrice();			
		}
		System.out.println("\t\t 총 주문 금액 : \u00A4 " + sum +"원");
		System.out.println("++++++++++++++++++++++++++");
		System.out.println();
	}
}	

