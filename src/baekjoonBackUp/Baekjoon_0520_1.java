package baekjoonBackUp;


import java.util.Scanner;
import java.util.StringTokenizer;

//1152
public class Baekjoon_0520_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();

		StringTokenizer st = new StringTokenizer(text, " ");
		System.out.println(st.countTokens());
		//text.split(" "); ����Ұ�� �յ� ������ �ڸ������� trim�� �߰��ؾ��Ѵ�. 
	}
}