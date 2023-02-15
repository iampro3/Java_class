package Day10.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedList {
	public static void main(String[] args) {
		//데이터 삽입 /삭제는 LinkedList가 ArrayList보다 성능이 좋다. 빠르다.
		List<String> arrayList = new ArrayList<>();
		List<String> LinkedList = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		
		for (int i = 0; i < 10000; i++) {
			arrayList.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		long arrayListTime = (endTime - startTime);
		System.out.println("ArrayList 데이터 삽입 시간:" + arrayListTime + "ns");
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			LinkedList.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		long linkedListTime = (endTime - startTime);
		System.out.println("LinkedList 데이터 삽입 시간 :" + linkedListTime + "ns");
		// 데이터 중간에 추가할 때는 LinkedList가 더 빠르다.
		if(arrayListTime > linkedListTime ) {
			System.err.println("ArrayList 보다 LinkedList가 데이터 삽입 시간이 더 빠르다.");
		}else {
			System.out.println("LinkedList보다 ArrayList가 데이터 삽입 시간이 더 빠르다.");
		}
	}
}
