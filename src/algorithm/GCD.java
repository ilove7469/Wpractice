package algorithm;

import java.util.Scanner;

//최대공배수 유클리드 호제법 사용
public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(getgcd(a,b));

	}

	private static int getgcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

}