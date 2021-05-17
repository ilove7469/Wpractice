package baekjoonTest;

import java.util.Scanner;

//2675
public class Baekjoon_0517 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String[] arr = text.split(" ");

		int num = Integer.parseInt(arr[0]);

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(arr[1].charAt(i));
			}
		}

	}
}