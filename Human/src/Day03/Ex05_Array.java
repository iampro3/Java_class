package Day03;

public class Ex05_Array {
	public static void main(String[] args) {
		int arr[][]= new int[2][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
	
		//[1][2][3]
		//[4][5][6]
		
		//arr.length : 첫번째 차원의 배열
		//arr.length[i] : 두번째 차원의 배열
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0;  j< arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
