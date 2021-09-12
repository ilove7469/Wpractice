package algorithm;

public class Pra0002 {

	// Call-By-Reference
	//객체의 참조값을 직접 바꾼것이 아니라
	//객체의 참조값을 통해서 그 객체의 멤버변수에 접근하여 그 값을 바꿨다는 것
	

	//자바는 객체를 메소드로 넘길때 객체를 참조하는 지역 변수의 실제 주소를 넘기는 것이 아니라 
	//그 지역변수가 가리키고 있는 힙 영역의 객체를 가리키는 새로운 지역 변수를 생성하여 그 것을 통하여 같은 객체를 가리키도록 하는 방식 이라고 한다
	public static void main(String[] args) {
		Number a = new Number(10);
		Number b = new Number(20);

		System.out.println("a = " + a.num);
		System.out.println("b = " + b.num);
		swap(a, b);
		System.out.println("a = " + a.num);
		System.out.println("b = " + b.num);

	}

	static void swap(Number x, Number y) {
		int temp = x.num;
		x.num = y.num;
		y.num = temp;

	}
}

class Number {
	int num;

	public Number(int num) {
		this.num = num;
	}
}
