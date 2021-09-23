package baekjoonBackUp;

import java.util.Scanner;

//1157
public class Baekjoon_0518 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		int[] arr = new int[26]; // 영문자 개수 26개

		for (int i = 0; i < text.length(); i++) {

			if ('A' <= text.charAt(i) && text.charAt(i) <= 'Z') {
				arr[text.charAt(i) - 'A']++;
			} else {
				arr[text.charAt(i) - 'a']++;
			}
			// 입력된 모든 문자 검사해서 해당 되는 배열에 카운트 올리기

		}
		// Arrays.sort(arr);

		// System.out.println(((char)((arr.length-1)+'A')));

		int max = 0;
		char result = ' ';

		// 배열하나씩 다 보면서 max값보다 높으면 입력 같은게 있따면 result에 물음표 입력
		for (int j = 0; j < 26; j++) {
			if (arr[j] > max) {
				max = arr[j];
				result = (char) (j + 65);
			} else if (arr[j] == max) {
				result = '?';
			}
		}
		System.out.println(result);
	}
}
