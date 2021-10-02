package test00;

public class test0 {

	public static void main(String[] args) {
		
		/* method1(); */
		/* method2(); */
		/* method3(); */
		/* method4(); */
		/* method5(); */
		/* method6(); */
		method7();

	}


	private static void method7() {

		int i =0;
		while(i<100) {
			i=i+1;
			System.out.println(i);
		}
		
	}


	private static void method6() {
		while(true) {
			System.out.println(1);
		}
		
	}


	private static void method5() {
		int result =2;
		
		switch (result) {
		case 1:
			System.out.println("1이다");
			break;
		case 2:
			System.out.println("2다");
			break;
		case 3:
			System.out.println("3이다");
			break;

		default:
			break;
		}

	}


	private static void method4() {
		int a=10;
		int b= 5;
		
		String result = (a<b ? "a" :"b");
		System.out.println(result);
		
	}


	private static void method3() {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		for(int a :arr) {
			System.out.println(a);
		}
		
	}


	private static void method2() {
		int a= 5;
		
		if(a<6) {
			System.out.println("작다");
		}else {
			System.out.println("크다");
		}
	}


	private static void method1() {
		
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
		
	}

}
