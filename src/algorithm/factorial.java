package algorithm;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int input = sc.nextInt();
		sc.close();
		
		int sum = factorial(input);
		System.out.println(sum);
		
	}

	private static int factorial(int input) {
		if(input <=1) return 1;  //재귀 종료조건
		return input * factorial(input-1); 
		// 계산된걸 반환한게 아니라 이 식 자체를 반환해서 
		//반환된 식 안에 팩토리얼을 또 계산하고 곱셈이 쌓이고 쌓이게 된다. 
		//결과적으로 5를 넣으면 5*4*3*2*1 이 되는 것이다 .
	}
}