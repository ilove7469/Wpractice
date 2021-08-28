package test00;

import java.util.Scanner;

public class test0 {

	public static void main(String[] args) {
		
		method1();

	}

	private static void method1() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int sum = 0;
		
		for(int i=1; i<=a; i++) {
			sum +=i;
			System.out.println(i);
		}
		System.out.println("정답은 : " + sum);
		
	}

}
