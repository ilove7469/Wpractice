package baekjoonBackUp;

import java.util.Arrays;
import java.util.Scanner;

//2750
public class Baekjoon_0511 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] aa = new int[num];

		for (int i = 0; i < aa.length; i++) {
			aa[i] = sc.nextInt();
		}
		Arrays.sort(aa);
		for (int j = 0; j < aa.length; j++) {
			System.out.println(aa[j]);
		}

	}
}
