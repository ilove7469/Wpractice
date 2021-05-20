package baekjoonTest;


import java.util.Scanner;
import java.util.StringTokenizer;

//1152
public class Baekjoon_0520_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();

		StringTokenizer st = new StringTokenizer(text, " ");
		System.out.println(st.countTokens());
	}
}

//text.split(" "); 사용할경우 앞뒤 공백을 자르기위해 trim도 추가해야한다. 