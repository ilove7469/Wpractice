package testtest;//11021

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_0411_4{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());

		for(int i=1; i<=n; i++) {
			String num = br.readLine();
			String[] num2 = num.split(" ");
			int a = Integer.parseInt(num2[0]);
			int b = Integer.parseInt(num2[1]);
			bw.write("Case #"+i+": "+ (a+b) +"\n");
		}
		bw.close();
	}
}