package testtest;

import java.util.Scanner;

public class Main_0425_1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		int input3=sc.nextInt();
		
		
		int inputResult = (input1 * input2 * input3);
		int[] aa= new int[10];
		
		while(inputResult !=0) {
			int data = inputResult % 10;
			aa[data]++;
			
			inputResult /=10;

		}
		
		for(int i = 0; i <aa.length; i++) {
			System.out.println(aa[i]);
		}
		

	}

}
