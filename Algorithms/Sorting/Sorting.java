import java.util.Arrays;

public class Sorting {
	public static int[] SelectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					Swap(i, j, array);
				}
			}
		}
		return array;
	}

	private static void Swap(int firstIndex, int secondIndex, int[] array) {
		int temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;
	}

	public static void QuickSortHelper(int[] unsortedArray, int start, int end) {
		if (start < end) {
			int splitPoint = partition(unsortedArray, start, end);
			QuickSortHelper(unsortedArray, start, splitPoint - 1);
			QuickSortHelper(unsortedArray, splitPoint + 1, end);
		}
	}

	private static int partition(int[] unsortedArray, int start, int end) {
 		int pivotValue = unsortedArray[start];
		int leftMark = start+1, rightMark = end;

		while (leftMark <= rightMark) {
			while (unsortedArray[leftMark] <= pivotValue && leftMark <= rightMark) {
				leftMark++;
			}

			while (unsortedArray[rightMark] >= pivotValue && leftMark <= rightMark) {
				rightMark--;
			}
			
			if (leftMark <= rightMark) {
				Swap(leftMark, rightMark, unsortedArray);
			}else {
				break;
			}
		}
		Swap(rightMark, start, unsortedArray);
		return rightMark;
	}
}
