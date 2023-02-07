package Day03;

public class Ex01_Array01 {
	public static void main(String[] args) {
		int arr[]; // 배열선언
		
		//배열 생성
		arr = new int[5];
		
		//배열 요소에 접근한다. : index(0부터 시작하는 순서번호)로 접근한다.
		arr[0] =1;
		arr[1] =2;
		arr[2] =3;
		arr[3] =4;
		arr[4] =5;
		
		//배열의 길이 : 배열요소의 개수 = 배열.length
		int N = arr.length;
		System.out.println("배열의 길이 : " +arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
