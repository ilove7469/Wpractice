package baekjoonTest;//1978

import java.util.Scanner;

public class Baekjoon_0526 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int num = sc.nextInt();
		int[] aa = new int[num];

		for (int i = 0; i < num; i++) {
			int temp = sc.nextInt();
			
			if (temp != 1) {
				if (temp % temp == 0) {
					count++;
				}

			}
		}
		System.out.println(count);
	}
}
