package Day10.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		//객체 추가 
		list.add("Java");	//프로그래밍	
		list.add("JDBC");	//Java 와 DB를 연결
		list.add("JSP");	//Java Server
		list.add("SPRING");	//Java기반 Web 개발 Framework
		
		int size = list.size();
		System.out.println("요소개수 : " + size);
		
		//객체검색
		String first = list.get(0);
		System.out.println("첫번재 기술 스택 : " + first);
		
		//반복 1
		System.out.println(">>반복 1");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		//반복2
		System.out.println(">>반복 2");
		for(String skill : list) {
			System.out.print(skill + " ");
		}
		System.out.println();
		
		//객체 삭제
		list.remove(0);
		list.remove("SPRING");
		
		System.out.println(list);
		
		//반복 3
		System.out.println(">>반복 3");
		Iterator<String> it = list.iterator();
		int i = 0;
		while(it.hasNext()) {
			String item = it.next();
			System.out.println("item : " + i++ + " : " + item);			
		}
	}
}
