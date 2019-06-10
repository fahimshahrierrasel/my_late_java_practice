import java.util.Arrays;


public class Solution {

	public static void main(String[] args) {
		char[] s = new char[] {'F','a','h','i','m'};
		reverseString(s);
		System.out.println(Arrays.toString(s));
	}
	
	public static void reverseString(char[] s) {
        helper(0, s);
    }
	
	public static void helper(int index, char[] s) {
		if(index >= s.length)
			return;
		
		char temp = s[index];
		helper(index+1, s);
		s[s.length - 1 - index] = temp;
	}

}
