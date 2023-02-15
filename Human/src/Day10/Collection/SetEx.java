package Day10.Collection;

import java.util.HashSet;
import java.util.Set;

/*
 * Set
 * : 순서없고, 중복요소를 허용하지 않는 컬렉션
 * 
 *  객체 추가
 *  -add() : 추가하는 객체가 컬렉션에 존재하지 않으면, true, 
 *  						 존재하면, false
 *  
 *  객체 검색
 *  -contains()	:해당 객체가 존재하면 true
 *  -isEmpty()	:요소가 하나도 없으면 true
 *  -size()		:요소의 개수를 반환
 *  
 *  객체 삭제
 *  -remove(Object)	:해당 객체를 삭제
 *  				 index가 없으므로, 객체로만 삭제할 수 있다.
 */
public class SetEx {
	public static void main(String[] args) {
		
		Set<Integer> set= new HashSet<>();
		
		System.out.println(set.add(1));
		System.out.println(set.add(2));
		System.out.println(set.add(3));
		System.out.println(set.add(4));
		System.out.println(set.add(5));
		
		for (Integer item : set) {
			System.out.println("item : " + item);			
		}
		//이미 존재하는 3,5를 추가
		System.out.println(set.add(3));
		System.out.println(set.add(5));

		for (Integer item : set) {
			System.out.println("item : " + item);			
		}
		
		set.remove(3);
		set.remove(5);
		System.out.println("size : " + set.size());

		for (Integer item : set) {
			System.out.println("item : " + item);			
		}		
	}
}
