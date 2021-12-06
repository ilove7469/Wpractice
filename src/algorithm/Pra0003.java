package algorithm;

public class Pra0003 {

	// 선택정렬
	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, 5, 4, 7, 7, 8, 9, 93, 5, 7 };
		int b;

		for (int i = 0; i < arr.length - 1; i++) {    //비교 기준이 되는 수를 정함
			for (int j = i + 1; j < arr.length; j++) { //기준되는 수와 비교하여 낮은 수를 기준이되는 수의 자리와 교체

				if (arr[i] > arr[j]) {  //만약 기준되는 수가 크다면 j가 작은수라서 앞으로 가야하니
					b = arr[j];    //작은수를 b에 넣고
					arr[j] = arr[i]; // 기준이 되었던 큰수는 수는 j로 넣고 
					arr[i] = b;//작은수를 비교 기준이됐던 인덱스에 넣어준다.
				}
			}
		}
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
	

}
