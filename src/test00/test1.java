package test00;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		
		// method1();
		 //method2();
		 method3();
		 


	}

	private static void method3() {
		//NaN 입력하는지 확인해야함 사용자가 데이터를 엉망으로 만들기위해 입력할수도있다고함 체크해야함 
		String input = "NaN";
		//double input = 1.0;
		Double val = Double.valueOf(input);
		
		Double aa = 100.0;
		
		if(Double.isNaN(val)) {
			System.out.println("nan입력됨");
			val =0.0;
		}
		
		aa += val;
		System.out.println(aa);
	}

	private static void method2() {
		//nan infinity연산
		//0으로나누면 컴파일은 되지만 예외가 발생해서 데이터 엉망될수있음
		try {
			int z = 5%0;
			System.out.println(z);
		}catch(ArithmeticException e) {
			System.out.println("못나눔");
		}
		
	}

	private static void method1() {
		//삼항연산자
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		String result =  (a>10) ? "oo" : "xx";
		System.out.println(result);
	}


}
