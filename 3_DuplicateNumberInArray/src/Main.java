/*
 * Problem From https://www.nowcoder.com/practice/623a5ac0ea5b4e5f95552655361ae0a8
 */
public class Main {

	public static void main(String[] args) {
		int[] array = { 0, 3, 3, 1, 4 };
		int[] duplicate = new int[array.length];

		if (duplicate(array, 5, duplicate)) {
			System.out.println("Duplicate");
			System.out.println(duplicate[0]);
		} else
			System.out.println("No Duplicate");

	}

	public static boolean duplicate(int[] nums, int length, int[] duplication) {
		if (nums == null || length <= 0)
			return false;
		for (int i = 0; i < length; i++) {
			while (nums[i] != i) {
				if (nums[i] == nums[nums[i]]) {
					duplication[0] = nums[i];
					return true;
				}
				swap(nums, i, nums[i]);
			}
		}
		return false;
	}

	private static void swap(int[] nums, int i, int j) {
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
	}

}
