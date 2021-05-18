package baekjoonTest;

import java.util.Scanner;

//1157
public class Baekjoon_0518 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		int[] arr = new int[26]; //영문자 개수 26개
		
		for(int i=0; i<text.length(); i++) {
			
			if('A' <= text.charAt(i) && text.charAt(i)<='Z') {
				arr[text.charAt(i)- 'A']++;
			}else {
				arr[text.charAt(i)-'a']++;
			}
			//입력된 모든 문자 검사해서 해당 되는 배열에 카운트 올리기
			
			

			
		}

	}
}