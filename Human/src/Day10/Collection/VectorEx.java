package Day10.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
//import java.util.Scanner;
import java.util.Vector;

/*
 * List 인터페이스
 * -객체추가
 * add(E)		:맨 끝에 추가
 * add(index)	:index에 추가
 * add(index, E):index의 객체를 E로 변경
 * 
 * -객체검색
 * get(index)	:index에 있는 객체를 반환
 * contains(Object)	: 객체가 컬렉션에 포함되어 있는지 확인 (true/false)
 * isEmpty()	:컬렉션이 비어있는지 확인
 * size()		:저장된 요소의 개수 반환
 * 
 * -객체 삭제
 * remove(index)	:index에 있는 객체를 삭제
 * remove(Object)	:객체를 삭제
 * clear()			:모든 요소 삭제
 */
public class VectorEx {
	public static void main(String[] args) {
		//컬렉션 객체 생성
		// 컬렉션 타입<요소타입> 변수명 = new 클래스명 <요소타입>();
		//벡터 객체 생성
		Vector<String> vector = new Vector<String>();
		
		// 요소 추가
		vector.add("모카라떼");
		vector.add("커피우유");
		vector.add("차이티라떼");
		vector.add("유자민트티");
		
		// 개수, 용량확인
		System.out.println("개수 : " + vector.size());
		//vector은 내부적으로 배열로 요소를 관리한다.
		//-기본 배열 요소의 개수를 10으로 생성하고
		//배열이 꽉찰 때마다 2배씩 용량을 증가시킨다. 
		System.out.println("용량 : " + vector.capacity());
		System.out.println();
		// 검색
		//반복방법 1
		System.out.println(">>반복 1");
		 for (int i = 0; i < vector.size(); i++) {
			String item = vector.get(i);
			System.out.println("메뉴이름 : " + item);
		}
		 System.out.println();

		 //반복방법 2
		 System.out.println(">>반복 2");
		 for (String item : vector) {
			 System.out.println("메뉴 이름 : " + item);			
		}
		 System.out.println();
		 
		 // 삭제
		 // 삭제할 떄, index는 앞으로 한 칸씩 당겨짐
		 				// 0	 1	   2	  3	
		 				// 모카라떼 커피우유 차이티라떼 유자민트티
		 vector.remove(0); //커피우유 차이티라떼 유자민트티
		 vector.remove(1); //커피우유 유자민트티 
		 vector.remove("커피우유"); //유자민트티
		 vector.remove("유자민트티"); //empty
		 
		 if(!vector.isEmpty()){
			 for (String item : vector) {
				 System.out.println("메뉴 이름 : " + item);				
			}			 
		 }else {
			 System.out.println("메뉴가 없습니다.");
		 }		 
		 
		 Scanner sc = new Scanner(System.in);
		 
		 //vector은 List인터페이스를 구현한 클래스
		 List<String> newMenuList = new Vector<String>();
		 
		 System.out.println("메뉴 추가하기(종료:0)");
		 do {
			 System.out.print("추가할 메뉴이릅 : ");
			 String menu = sc.nextLine();
			 
			 if(menu.equals("0"))
			 break;
			 
			 newMenuList.add(menu);
		 }while(true);
		 
		 //반복방법3
		 //Iterator 를 사용한 반복
		 //해당 리스트 컬렉션으로부터 Iterator 객체를 가져옴
		 //Iterator
		 //hasNext()	:다음 요소의 존재 여부를 반환
		 //next()		:다음 요소를 반환
		 System.out.println(">>반복");
		 //컬렉션 객체.iterator()	: 해당 컬렉션에 대한 iterator 객체 를 반환
		 Iterator<String> it = newMenuList.iterator();
		 
		 System.out.print("새로 추가된 메뉴 : ");
		 while(it.hasNext()) {
		 String item = it.next();
		 System.out.print(item);
		 
		 	if(it.hasNext()) {
		 		System.out.print(", ");
		 	}else {
		 		System.out.println();
		 	}	
		 
		}		
		 sc.close();
	}
	
}
