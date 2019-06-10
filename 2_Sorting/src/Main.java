import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		int[] array = {18,62,57,98,23,80,82,32,29,13};
		System.out.println("Given: " + Arrays.toString(array));
		Sorting.QuickSortHelper(array, 0, array.length - 1);
		System.out.println("Sorted : " + Arrays.toString(array));
//		System.out.println("Sorted: " + Arrays.toString(sortedArray));
	}
}
