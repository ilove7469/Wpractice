package algorithm;

public class Pra0001 {

	//Call-By-Value
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		swap(a,b);
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		
	}

	private static void swap(int x, int y) {
		int temp = x;
		x= y;
		y= temp;
		

	}

}
