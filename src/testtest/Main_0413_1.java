package testtest;//1110 더하기 사이클
//https://st-lab.tistory.com/43

import java.util.Scanner;

public class Main_0413_1{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int temp = 0;
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		for(int j=0; j<n; j++ ) {
			for(int k=j; k<n; k++) {
				if(arr[j]<arr[k])
				temp = arr[j];
				arr[j]=arr[k];
				arr[k]=temp;
			}
				
		}
		System.out.println(arr[0] +" "+arr[4]);
		
	}
}
