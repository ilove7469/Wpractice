package baekjoonTest;//1712

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_0524 {

   public static void main(String[] args) throws NumberFormatException, IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int a = Integer.parseInt(st.nextToken()); //고정비
	   int b = Integer.parseInt(st.nextToken()); //변동비
	   int c = Integer.parseInt(st.nextToken()); //가격

	   if(c <= b) {
		   System.out.println("-1");
	   }else {
		   System.out.println((a/(c-b))+1);
	   }
	   
   }
}

//손익분기점시 판매량(Q) = a(고정비) / {가격(p) – b(단위당 변동비)}
//이윤이 없는 즉, 판매가격이 가변비용을 넘지 못하는 경우 -1
