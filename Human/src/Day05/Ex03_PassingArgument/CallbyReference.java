package Day05.Ex03_PassingArgument;

import Day04.Class.Pikachu;

public class CallbyReference {
	public static void setArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 10;
		}	
		
		System.out.println("**** setArr 메소드 ****");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr [" + i + " ] :" + arr[i]);
		}
		System.out.println();
	}
		
		public static void setObj(Pikachu pikachu) {
			pikachu.energy = 1000;
			pikachu.type = "fire";
			System.out.println("**** setObj 메소드 ****");
			System.out.println(pikachu);
			System.out.println();
		}
		
		public static void main(String[] args) {
			int[] arr = new int[5];
			Pikachu pikachu = new Pikachu();
			pikachu.energy = 100;
			pikachu.type = "전기";
			
			for (int i = 0; i < arr.length; i++) {
				// 10,20,30,40,50
				arr[i] = i+1;
			}
			
			System.out.println("**** main 메소드 ****");
			for (int i = 0; i < arr.length; i++) {
				System.out.println("arr [" + i + " ] :" + arr[i]);
			}
			System.out.println(pikachu);
				
				setArr(arr);
				setObj(pikachu);
				
				System.out.println("**** set** 메소드 호출 후 ****");
			for (int i = 0; i < arr.length; i++) {
					System.out.println("arr [" + i + " ] :" + arr[i]);		
				}
			System.out.println(pikachu);
			}
		}

	
