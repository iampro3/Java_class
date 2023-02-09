package Day08.Ex02_Lang;

public class StringBuilderEx {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("휴먼 ");
		sb.append("교육센터 ");
		System.out.println(sb.toString());
		
		sb.insert(7, "학원");
		System.out.println(sb.toString());
		
		sb.setCharAt(0, 'H');
		System.out.println(sb.toString());
		
		sb.replace(1, 3, "uman ");		// 0부터 시작한다. 1~ 3까지 수정
		System.out.println(sb.toString());
		
		sb.delete(0, 6);
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("글자수 : " + length);	// 교육센터 뒤에 빈간이 있었음.
	}
}
