package baekjoonBackUp;

//11720
import java.util.Scanner;

public class Baekjoon_0514 {

	public static void main(String[] args) {
  		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String s_arr= sc.next();
		
		int result = 0;
		
		for(int i=0; i<num; i++) {
			result += s_arr.charAt(i)-'0';
		}
		System.out.println(result);

	}

}
