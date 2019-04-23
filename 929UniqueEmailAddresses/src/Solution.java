import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static int numUniqueEmails(String[] emails) {
		 
		 Set<String> emailSet = new HashSet<String>();
		 
		 for(String email: emails) {
			 int indexOfAt =  email.indexOf('@');
			 
			 String aEmail = email.substring(0, indexOfAt);
			 
			 int firstIndexOfPlus = aEmail.indexOf('+') < 0? aEmail.length(): aEmail.indexOf('+');
			 
			 aEmail = aEmail.substring(0, firstIndexOfPlus);
			 
			 aEmail = aEmail.replace(".", "");
			 
			 aEmail = aEmail + email.substring(indexOfAt);
			 
			 emailSet.add(aEmail);
			 
		 }
		 
		 return emailSet.size();
	 }

}
