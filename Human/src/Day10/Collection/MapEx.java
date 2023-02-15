package Day10.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * map
 * : 키(key),값(value)를 쌍으로 이루어진 컬렉션
 * 			+key는 중복되지 않는다.
 * 
 * 객체 추가
 * -put(key, value)		: 키와 값을 추가
 * 						  -중복된 키를 추가하면, 마지막에 추가한 값이 저장된다.
 * 
 * 객체 검색
 * -contains(key)			:키가 존재하는지 여부
 * -containsValue(value)	:값이 존재하는지 여부
 * -get(key)				:키에 해당하는 값을 반환
 * -isEmpty()			:요소가 비어있는지 여부
 * -size()				:요소의 개수를 반환
 * -keySet()			:모든 키를 Set객체로 반환
 * -values()			:모든 값을 collection객체로 반환
 * 
 * 객체 삭제
 * -remove(key)			:키에 해당하는 값을 삭제
 * -clear()				:모든 요소 삭제
 */
public class MapEx {
	
	private static final String String = null;
	private static final String Integer = null;

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("RM", 90);
		map.put("진", 100);
		map.put("슈가", 70);
		map.put("제이홉", 50);
		map.put("지민", 80);
		map.put("뷔", 60);
		map.put("정국", 95);
		
		System.out.println("총 개수 :" + map.size());
		System.out.println();
		
		System.out.println("지민의 코딩성적 : " + map.get("지민") );
		
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			Integer value = map.get(key);
			System.out.println(key + " : " + value);			
		}
		System.out.println();
		
		map.remove("지민");
		System.out.println("총 객체 수 : " + map.size());
		
		//Iterator 를 이용한 반복
		//map.entrySet()		:iterator() 메소드를 갖는 Set 객체를 반환한다
		//entrySet.iterator()	:Map 컬렉션을 순차검색할 수 있는 Iterator 객체를 가져온다.
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			System.out.println(key + " : " + value);			
		}
		map.clear();
		
		System.out.println("총 객체 수 : " + map.size());
		System.out.println("empty 여부 : " + map.isEmpty());
	}
}
