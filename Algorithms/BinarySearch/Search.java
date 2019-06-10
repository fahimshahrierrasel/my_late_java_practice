
public class Search {
	public static int iBinearySearch(int[] sortedArray, int searchNumber) {
		int lowIndex = 0, highIndex = sortedArray.length - 1, midIndex;
		
		while (lowIndex <= highIndex) {
			midIndex = (lowIndex + highIndex) / 2;
			int midValue = sortedArray[midIndex];
			if(midValue == searchNumber)
				return midIndex;
			else if(midValue < searchNumber)
				lowIndex = midIndex + 1;
			else
				highIndex = midIndex - 1;
		}
		return -1;
	}
	
	public static int rBinarySearch(int[] sortedArray, int searchNumber) { 
		return rBinarySearchHelper(sortedArray, searchNumber, 0, sortedArray.length - 1);
	}
	
	private static int rBinarySearchHelper(int[] sortedArray, int searchNumber, int lowIndex, int highIndex) {
		int midIndex = (lowIndex + highIndex) / 2;
		int midValue = sortedArray[midIndex];
		if ( lowIndex > highIndex )
			return -1;
		
		if(midValue == searchNumber)
			return midIndex;
		else if(midValue < searchNumber)
			return rBinarySearchHelper(sortedArray, searchNumber, midIndex + 1, highIndex);
		else
			return rBinarySearchHelper(sortedArray, searchNumber, lowIndex, midIndex - 1);
	}

}
