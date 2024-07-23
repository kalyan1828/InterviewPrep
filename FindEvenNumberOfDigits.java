
public class FindEvenNumberOfDigits {
	public static int findNumbers(int[] arr) {
		int count =0;
		for(int i: arr) {
			if(digits(i)%2==0) {
				count++;
			}
		}
		return count;
	}
	public static int digits(int num) {
		int dig=0;
		while(num!=0) {
			num/=10;
			dig++;
			
		}
		return dig;
	}
	public static void main(String[] args) {
		int [] nums= {1234,1234,12345,123456};
		System.out.println("The number of even digits are "+findNumbers(nums));
	}
}
