package baekjoonTest;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon0505 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] aa = new int[len];

		for (int i = 0; i < len; i++) {
			aa[i] = sc.nextInt();
		}

		Arrays.sort(aa);

		double m = (int) aa[len - 1];
		double sum = 0;
		double avg = 0;

		for (int i = 0; i < len; i++) {
			sum += (int) aa[i] / m * 100;
		}

		avg = sum / len;
		System.out.println(avg);

	}
}
