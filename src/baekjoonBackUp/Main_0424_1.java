package baekjoonBackUp; //3052

import java.util.Scanner;

public class Main_0424_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean[] arr = new boolean[42];

		for (int i = 0; i < 10; i++) {
			arr[sc.nextInt() % 42] = true;
		}
		int count = 0;
		for (boolean value : arr) {
			if (value) {
				count++;
			}
		}
		System.out.println(count);
	}

}
