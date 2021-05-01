package baekjoonBackUp;//10871

import java.util.Scanner;

public class Main_0411_8{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arrNum = sc.nextInt();
		int b = sc.nextInt();
		
		int[] arr = new int[arrNum];
		
		for (int i = 0; i < arrNum; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arrNum; i++) {
			if (arr[i] < b) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
