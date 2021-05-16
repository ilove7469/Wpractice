package baekjoonTest;

//10809
import java.util.Scanner;

public class Baekjoon_0516 {

	public static void main(String[] args) {
  		Scanner sc = new Scanner(System.in);
  		String text = sc.next();
  		
  		for(char c='a'; c<='z'; c++) {
  			System.out.print(text.indexOf(c)+ " ");
  		}
	}
}

/*
문자열의 위치를 반환하는 indexOf() 함수 사용법에 대한 문제
indexOf를 사용하면 해당 문자가 처음으로 등장하는 위치를 리턴
만약 해당 문자가 문자열에 없으면 -1을 리턴
*/