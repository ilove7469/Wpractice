package baekjoonBackUp;//10951

import java.util.Scanner;

public class Main_0412_2{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		int num = n;
		int count = 0;
		int a,b,sum;
		
		
		while(true) {
			a=num/10;
			b=num%10;
			sum=a+b;
			count++;
			num=b*10+sum%10;
			if(n==num) break;
		}
		System.out.println(count);
	}
}
