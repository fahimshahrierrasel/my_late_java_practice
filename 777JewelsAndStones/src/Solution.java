
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = numJewelsInStones("z", "ZZ");
		System.out.println(num);
		num = numJewelsInStones("aA", "aAAbbbbbb");
		System.out.println(num);
		num = numJewelsInStones("AZ", "aaaaaaaAAAZZzzzz");
		System.out.println(num);

	}
	
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
