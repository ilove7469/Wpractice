package algorithm;

public class Pra0004 {

	//팩토리얼 
	//자기자신을 불러서 n~1까지 구하는 방법
	public static void main(String[] args) {
		
	int i=4;

	System.out.println(factorial(i));

	}

	public static int factorial(int num) {
		if(num <=1) {
			return num;
		}else{
			return num*factorial(num -1);
		}
			
		
	}
	/*
	4가 들어오면
	1보다 크니깐 else에 3이 호출된다 
	그리고 factorial(4)는 종료안되고 stack에 쌓인상태로
	호출한 fact(3)이 실행되는것으로 계속 반복된다.
	
	4*factorial(3)
	3*factorial(2)
	2*factorial(1)
	
	1*2
	fact(2)종료 
	fact(3)실행
	2*3
	fact(3)종료
	fact(4)실행
	6*4
	
	4!를 구했고 main에서 출력
	*/
	
}
