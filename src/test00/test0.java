package test00;

import java.util.ArrayList;
import java.util.Scanner;

public class test0 {

	public static void main(String[] args) {
		
		/* method1(); */
		/* method2(); */
		method3();

	}

	private static void method3() {
		int[] inputa = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int[] resultnum;

		for(int i = 0 ; i < inputa.length ; i++){	
				arr.add(inputa[i]);
		}
		arr.add(0,0);
	    for(int j = 0 ; j < arr.size() ; j++){
			if(j%3 == 0) {
	        System.out.println(arr.get(j));
			}
	    }
	    System.out.println("----------");
	    

		
	}

	private static void method2() {
		int[] inputt = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arrA = new int[inputt.length + 1];

		for (int i = 0; i < inputt.length; i++) {

			for (int j = 1; j <= inputt.length; j++) {
				arrA[j] = inputt[i];
			}

		}

		for (int k = 0; k < inputt.length; k++) {
			System.out.println(arrA[k]);
		}
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
