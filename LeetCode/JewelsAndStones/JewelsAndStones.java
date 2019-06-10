// https://leetcode.com/problems/jewels-and-stones/
public class JewelsAndStones {
	public static int numJewelsInStones(String J, String S) {
		int[] hashTable = new int[('z' - 'A') + 1];
		int total = 0;
		
		
		for (int i = 0; i < S.length(); i++) {
			hashTable[hashIndex(S.charAt(i))]++;
		}
		
		for(int i = 0; i < J.length(); i++) {
			total += hashTable[hashIndex(J.charAt(i))];
		}
		
		return total;
    }
	
	public static int hashIndex(char letter) {
		return (letter - 'A');
	}
}
