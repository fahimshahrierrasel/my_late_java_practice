import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] number = new int[] {3, 1, 2, 4};
		System.out.println(Arrays.toString(sortArrayByParity(number)));
	}
	
	public static int[] sortArrayByParity(int[] A) {
        
		int[] even = new int[A.length];
		int[] odd = new int[A.length];
		int i = 0, j = 0;
		
		for(int num: A) {
			if (num % 2 == 0) {
				even[i] = num;
				i++;
			}else {
				odd[j] = num;
				j++;
			}
		}
		
		for(int k = 0; k < j; k++) {
			even[i+k] = odd[k];
		}
		
		return even;
    }

}
