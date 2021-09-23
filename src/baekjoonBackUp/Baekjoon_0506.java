package baekjoonBackUp;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

//8958
public class Baekjoon_0506 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		//ox���ڿ� ���� ����
		String str;
		for (int i = 0; i < r; i++) { //�� �ݺ�Ƚ��
			str = sc.next();
			int sum = 0;
			int cnt = 0;
			for (int j = 0; j < str.length(); j++) {//���� �Էµ� ������ŭ �ݺ��ϸ鼭 �˻�
				if (str.charAt(j) == 'O') {
					cnt++;
					sum += cnt;
				} else {
					cnt = 0; //x�� cnt�� 0���� �����Ų��.
				}
			}
			System.out.println(sum);
		}
	}
}
