package baekjoonTest;

import java.util.Arrays;
import java.util.Scanner;

//10989  시간 초과 다시풀기
public class Baekjoon_0522 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int input1 = sc.nextInt();
      int[] arr = new int[input1];
      
      for(int i=0; i<input1; i++) {
    	  arr[i] = sc.nextInt();
    	 
      }
      Arrays.sort(arr);
      for(int a : arr) {
    	  System.out.println(a);
      }
   }
}