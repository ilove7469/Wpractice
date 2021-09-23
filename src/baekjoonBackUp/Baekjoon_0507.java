package baekjoonBackUp;

import java.util.Scanner;

//4344 ������
public class Baekjoon_0507 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		
		for(int i = 0 ; i < C ; i++) {
			int N = sc.nextInt();
			int[] score = new int[N];
			int sum = 0;
			int avg = 0;
			int cnt = 0;
			
			for(int j = 0 ; j < N ; j++) {
				score[j] = sc.nextInt();
				
				sum += score[j];
			}
			avg = sum / N;
			for(int j = 0 ; j < N ; j++) {
				if(score[j] > avg) {
					cnt++;
				}
				
			}
			float stuAvg = (float) (cnt * 100 ) / N;
			System.out.printf("%.3f%%\n", stuAvg);
		}
	}

}