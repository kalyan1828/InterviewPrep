
public class SortedSquares {
	public static int[] squares(int [] nums,int n) {
		int [] sq=new int[n];
		for(int i=0;i<n;i++) {
			sq[i]=nums[i]*nums[i];	
		}
		return sq;
	}
	public int[] sortedsq(int []nums,int n) {
		int temp;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(nums[j]>nums[j+1]) {
					temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
					
				}
			}
		}
		return nums;
	}
	public static void main(String[] args) {
		SortedSquares obj=new SortedSquares();
		int [] arr= {-1,-2,3,2,1};
		int n=arr.length;
		int []sorted=obj.sortedsq(squares(arr,n), n);
		for(int i:sorted) {
			System.out.println(i);
		}
		System.out.println(obj.sortedsq(arr,5).toString());
	}
}
