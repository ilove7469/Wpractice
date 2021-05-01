package baekjoonBackUp;//10818


import java.util.Arrays;
import java.util.Scanner;

public class Main_0415{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int[] arr = new int[9];

		for(int i=0; i<9; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
	
		System.out.println(arr[9-1]);

		
	}
}