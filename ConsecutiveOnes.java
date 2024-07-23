
public class ConsecutiveOnes {
	public static int findMaxConsecutiveOnes(int[] nums) {
		int max=0,count=0;
		for(int i:nums) {
			if(i==1) {
				count++;
				max=Math.max(max, count);
			}
			else {
				count=0;
			}
		}
		return max;
	}
	 public static void main(String[] args) {
		int nums[]= {1,1,1,0,0,1,1,1,1};
		System.out.println("The max consecutive ones in the array are  " +findMaxConsecutiveOnes(nums));
	}
}
