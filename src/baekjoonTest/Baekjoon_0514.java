package baekjoonTest;

//11720
import java.util.Scanner;

public class Baekjoon_0514 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		int[] arr= new int[num];
		String bb = sc.nextLine();
		
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i]=bb.charAt(i);
		}
		
		for(int j=0; j<arr.length; j++) {
			result += arr[j];
		}
		System.out.println(result);
	}

}

