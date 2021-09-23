package test00;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		
		 method1();


	}

	private static void method1() {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		String result =  (a>10) ? "oo" : "xx";
		System.out.println(result);
	}


}
