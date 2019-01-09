package Numbers;

public class CountPrimeNums {
	public int solution(int n) {
		
		int count = 0; // the number of prime numbers
		int[] nums = new int[n+1];
		
		for(int i=2; i<=n; i++) {
			int j = 2;
			while(i*j <= n) {
				nums[i*j] = 1;
				j++;
			}
		}
		
		nums[0] = 1;
		nums[1] = 1; // 1 is not a prime number
		
		for(int num : nums)
			if(num != 1)
				count++;
		
		return count;
	}
}
