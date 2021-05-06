package baekjoonTest;

import java.util.Scanner;

//4344 ม๘วเม฿
public class Baekjoon_0507 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();

		for (int i = 0; i < r; i++) {
			int student = sc.nextInt();
			double aver = 0;
			int cnt = 0;
			double averOver=0;

			int[] scoreInput = new int[student];
			for (int j = 0; j < student; j++) {
				scoreInput[j] = sc.nextInt();
				aver += scoreInput[j];
			}
			aver /= student;
			for (int k = 0; k < student; k++) {
				if (scoreInput[k] > aver) {
					cnt++;
				}
				averOver = (double)cnt / (double)student * 100;
				
			}
			System.out.println(averOver);
		}
		

	}
}
