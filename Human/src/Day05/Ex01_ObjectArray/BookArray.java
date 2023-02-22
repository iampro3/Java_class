package Day05.Ex01_ObjectArray;

import java.util.Scanner;

/*
 * 
 * 책제목 , 저장명을 갖는 Book라는 클래스를 정의하고 
 * book 클래스 타임의 객체 배열을 생성하여 사용자로부터 책 3권을 입력받아 출력하는 프로그램을 작성하시오
 */

class Book{
	String title, author;
	
	public Book(){
		this("제목없음", "작자미상");
	}
	
	//@Override
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title =" + title+ ", author=" + author+"]";
	}
}
public class BookArray {
	public static void main(String[] args) {
		// book 타입의 객체 배열 선언 및 생성
		Book[] bookArray = new Book[3];
		Scanner sc = new Scanner(System.in);
		
		// 사용자입력
		for (int i = 0; i < bookArray.length; i++) {
			System.out.print("제목 :");
			String title = sc.nextLine();
			
			System.out.print("저자 :");
			String author = sc.nextLine();
			
			// Book 객체를 생성하여 bookArray
			bookArray[i] = new Book(title, author);			
		}
		
		// 출력
		for (Book book : bookArray) {
			System.out.println(book);		
			
		}
		sc.close();		
	}
}
