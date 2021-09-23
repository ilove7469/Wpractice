package baekjoonBackUp;

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
���ڿ��� ��ġ�� ��ȯ�ϴ� indexOf() �Լ� ������ ���� ����
indexOf�� ����ϸ� �ش� ���ڰ� ó������ �����ϴ� ��ġ�� ����
���� �ش� ���ڰ� ���ڿ��� ������ -1�� ����
*/