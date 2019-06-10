import java.util.Arrays;
import java.util.Scanner;

public class MaximumInterval {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int l = scanner.nextInt();
		int[] array = new int[n];
		int count = 0;
		int temp = n;
		while (temp-- > 0) 
        { 
            array[count++] = scanner.nextInt(); 
        }
		
		int s = n - l + 1;
		
		for(int i = 0; i < s; i++) {
			int[] arr = Arrays.copyOfRange(array, i, i+l);
			System.out.println(findMax(arr, arr.length));
		}
	}
	
    public static int findMax(int A[], int length) 
    { 
      if(length == 1) 
        return A[0]; 
      
      int max = findMax(A, length-1);
      
      if (A[length-1] > max)
        return A[length-1];
      else
    	  return max;
    } 
  

}
