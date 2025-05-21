
public class ArrayEx10 {

	public static void main(String[] args) {

		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++)
			System.out.print((nums[i] = i)+" ");
		System.out.println("\n======================");
		for (int i = 0; i < 100; i++) {
			int n = (int)(Math.random()*10);
			int tmp = nums[0];
			nums[0] = nums[n];
			nums[n] = tmp;
		}
		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i]+" ");
		System.out.println();
		for (int i : nums)
			System.out.print(i+" ");
	}

}
