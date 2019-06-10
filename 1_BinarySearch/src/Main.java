
public class Main {

	public static void main(String[] args) {
		int[] array = new int[] {1, 12, 18, 22, 24, 25, 33, 37, 45, 56, 67, 78, 89, 90};
		
		int result = Search.rBinarySearch(array, 1);
		if(result > -1)
			System.out.println("Found at position: " + result);
		else
			System.out.println("Not found!!");
	}

}
