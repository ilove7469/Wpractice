package baekjoonTest;

//15596
public class Test {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		System.out.println(sum(a));
		
	}

    static long sum(int[] a) {
        long ans = 0;
        
        for(int i=0; i<a.length; i++) {
        	ans += a[i];
        }
        return ans;
    }
	


}