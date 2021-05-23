package baekjoonTest;//10989

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_0522 {

   public static void main(String[] args) throws NumberFormatException, IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int input1 = Integer.parseInt(br.readLine());
      int[] arr = new int[input1];
      
      for(int i=0; i<input1; i++) {
    	  arr[i] = Integer.parseInt(br.readLine());
    	 
      }
      Arrays.sort(arr);
      
      StringBuffer sb = new StringBuffer();
      for(int a: arr) {
    	 sb.append(a+"\n");
      }
      System.out.println(sb);
   }
}
