package baekjoonTest;

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

//출력형식이 잘못되었습니다 라는 문구가 떠서 trim으로 공백 제거
//원래는 공백도 포함해서 돌았다
//공백 포함해서 한번에 한줄들어오는 줄알았는데 아니었다... 백준문제 헷갈리는점...
