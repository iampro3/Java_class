package Day10.Collection;

import java.util.Stack;

/*
 * Stack
 * :'쌓다'
 * 	데이터를 한 쪽 방향으로만 추가하고 삭제할 수 있는 자료구조
 * 	최상위 데이터 : top
 * 	자료추가 :push : top 위에 데이터를 추가
 * 	자료삭제 :pop  : top 위치의 데이터를 삭제
 * 
 * 	Last In First out(LIFO / 후입선출)
 * 	"마지막에 추가된 데이터가 가장 먼저 삭제된다."
 */
public class StackEx {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		System.out.println("empty : "+ stack.isEmpty());
	
		//push(요소) : 요소를 TOP위에 삭제
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println("empty : " + stack.isEmpty());
		System.out.println("1. 포함여부 : " + stack.contains(1));
		
		for (Integer item : stack) {
			System.out.println("item : " + item);
		}
		
		//peek : TOP의 데이터를 반환
		System.out.println("Top :" + stack.peek());
		System.out.println("Size :" + stack.size());
		
		// pop() top의 요소를 삭제
		stack.pop();		//:index로 삭제
		stack.remove(1);	//:객체를 지정하여 삭제
		stack.remove((Integer) 3);
		
		for (Integer item : stack) {
			System.out.println("item : " + item);			
		}
		stack.clear();		//전체 요소 삭제
		System.out.println("empty :" + stack.isEmpty());
	}	
}
