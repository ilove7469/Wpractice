package baekjoonBackUp; //14681


import java.util.Scanner;

public class b_0410_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(); 
		int m = sc.nextInt();

		if (m < 45) {
			
			if (h > 0) {
				h=h-1;
				m = 60 - (45 - m);
				System.out.println(h + " " + m);
			}else {
				h=23;
				int d = 60 - (45-m);
				System.out.println(h + " " + d);

			}

		} else if(m>=45) {
			m = m - 45;
			System.out.println(h + " " + m);
		}
	
	}
}