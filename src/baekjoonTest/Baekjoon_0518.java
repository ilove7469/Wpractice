package baekjoonTest;

import java.util.Scanner;

//1157
public class Baekjoon_0518 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		int[] arr = new int[26]; //������ ���� 26��
		
		for(int i=0; i<text.length(); i++) {
			
			if('A' <= text.charAt(i) && text.charAt(i)<='Z') {
				arr[text.charAt(i)- 'A']++;
			}else {
				arr[text.charAt(i)-'a']++;
			}
			//�Էµ� ��� ���� �˻��ؼ� �ش� �Ǵ� �迭�� ī��Ʈ �ø���
			
			

			
		}

	}
}