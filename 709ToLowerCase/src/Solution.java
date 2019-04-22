
public class Solution {

	public static void main(String[] args) {
		System.out.println(toLowerCase("Fahim"));
		System.out.println(toLowerCase("here"));
		System.out.println(toLowerCase("LOVELY"));
		System.out.println(toLowerCase("LOVELY123"));
	}
	
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
