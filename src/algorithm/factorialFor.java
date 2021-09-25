package algorithm;

import java.util.Scanner;

public class factorialFor {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
 
        int x = 0;
        int factorial = 1;
 
        x = sc.nextInt();
 
        for (int i = x; i >= 1; i--) {
        	factorial = factorial * i;
        }
        System.out.print(factorial);
}
}