package baekjoonBackUp;

import java.util.Scanner;

//2908
public class Baekjoon_0521 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int input1 = sc.nextInt();
      int input2 = sc.nextInt();
      
      int a = Integer.parseInt(new StringBuilder().append(input1).reverse().toString());
      int b = Integer.parseInt(new StringBuilder().append(input2).reverse().toString());

      System.out.println(a>b? a:b);
      
      
      
      /*
        ���� StringBuilder �� ���ڿ��� �ٷ�� Ŭ������ ���� ���̰� �ִµ�, ���⼭ reverse() ��� ���� ���� �޼ҵ带 �����ϰ� �ִ�.
		��, ���� ����ϱ� ���� ���� StringBuilder ������ ���ÿ� append() ��� �޼ҵ忡 ���� �־��ش�.
		�̶� append() �� �־��� ���� Ÿ���� StringBuilder ��� Ÿ������ ��ȯ�ȴ�.
		�׸��� �׷��� ����� ���� reverse() ��� �޼ҵ带 ���� ����Ǿ��ִ� ���ڿ��� �����´�. �׸��� StringBuilder Ÿ���� ���ڿ��� ��ȯ��Ű�� ���� toString() �� ���ָ� ���̴�.
		�׸��� ���ڿ��� ��ȯ�������� Integer.parseInt() �� String �� int �� Ÿ���� �����Ű�� ���̴�.
       
       */
   }
}