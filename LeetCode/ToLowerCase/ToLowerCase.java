// https://leetcode.com/problems/to-lower-case/
public class ToLowerCase {
	public static String toLowerCase(String str) {
		char[] array = str.toCharArray();
		int constant = 'a' - 'A';
		
		for(int i = 0; i < array.length; i++) {
			 if(array[i] >= 'A' && array[i] <= 'Z')
				 array[i] += constant;
		}
		
        return String.copyValueOf(array);
    }
}
