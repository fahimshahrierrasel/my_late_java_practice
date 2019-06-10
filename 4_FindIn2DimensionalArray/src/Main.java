/*
 * Problem from https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e
 */
public class Main {
	
	public static <T> void println(T data) {
		System.out.println(data);
	}
	
	public static <T> void print(T data) {
		System.out.print(data);
	}

	public static void main(String[] args) {
		int[][] array2d = { 
				{ 1, 4, 7, 11, 15 }, 
				{ 2, 5, 8, 12, 19 }, 
				{ 3, 6, 9, 16, 22 }, 
				{ 10, 13, 14, 17, 24},
				{ 18, 21, 23, 26, 30 }
			};
		
		int number = 13;
		
		int row = 0;
		int column = array2d[0].length - 1;
		while(row < array2d.length && column < array2d[row].length && column >= 0) {
			if (number > array2d[row][column]) {
				row++;
			}
			else if(number < array2d[row][column]) {
				column--;
			}else {
				println("Found at [" + row + ", " + column + "]" );
				break;
			}
		}
	}
}
