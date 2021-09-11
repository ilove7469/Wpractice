package algorithm;

public class Pra0000 {
	
	//이분 탐색(Binary Search)
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
		
		System.out.println(search(arr, 7));
	}

	private static String search(int[] arr, int number) {
		int start = 0;
		int end = arr.length-1;
		int mid= (end+start)/2; //중간값 구하기
		
		while(end-start>=0) {
			if(arr[mid] == number) { //입력값과 중간값 같은지 확인
				return "찾음";
			}else if (arr[mid]<= number) { //중간값보다 입력값이 크다면
				start = mid+1; //중간값에 1을 더한값을 시작으로 맞춰서 큰쪽(오른쪽)범위를 정해준다
			}else {
				end = mid-1; // 외와 반대일경우 작은쪽(왼쪽)의 범위를 정해준다.
			}
			mid=(end+start)/2; //중간값 다시 계산....
		}
		return "못찾음";
	}
	
	
}
