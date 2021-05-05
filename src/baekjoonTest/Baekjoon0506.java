package baekjoonTest;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

//8958
public class Baekjoon0506 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		//ox문자열 담을 변수
		String str;
		for (int i = 0; i < r; i++) { //총 반복횟수
			str = sc.next();
			int sum = 0;
			int cnt = 0;
			for (int j = 0; j < str.length(); j++) {//한줄 입력된 갯수만큼 반복하면서 검사
				if (str.charAt(j) == 'O') {
					cnt++;
					sum += cnt;
				} else {
					cnt = 0; //x면 cnt를 0으로 변경시킨다.
				}
			}
			System.out.println(sum);
		}
	}
}
