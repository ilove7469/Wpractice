package baekjoonBackUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

//2751
public class Baekjoon_0512 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(arr);

		for (int i = 0; i < N; i++) {
			sb.append(arr.get(i));
			sb.append("\n");
		}

		System.out.println(sb);
		/*
		StringBuilder test = new StringBuilder();
		test.append("1");
		test.append("\n");
		test.append("2");
		System.out.println(test);
		*/
	}
}