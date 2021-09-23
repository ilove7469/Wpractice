package baekjoonBackUp;

import java.util.Scanner;

//2675
public class Baekjoon_0517_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testnum = sc.nextInt();

		for (int i = 0; i < testnum; i++) {
			int num = sc.nextInt();
			String text = sc.nextLine().trim();
			
			for (int j = 0; j < text.length(); j++) {
				for (int k = 0; k < num; k++) {
					System.out.print(text.charAt(j));
				}
			}
			System.out.println();
		}
	}
}

//��������� �߸��Ǿ����ϴ� ��� ������ ���� trim���� ���� ����
//������ ���鵵 �����ؼ� ���Ҵ�
//���� �����ؼ� �ѹ��� ���ٵ����� �پ˾Ҵµ� �ƴϾ���... ���ع��� �򰥸�����...
