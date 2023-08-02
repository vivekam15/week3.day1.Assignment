package week3.day2Assignment;

import java.util.HashSet;
import java.util.Set;

public class RemovesDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="PayPal India";
		char[] charArray=input.toCharArray();
		Set<Character> charSet= new HashSet<Character>();
		Set<Character> dupcharSet= new HashSet<Character>();
		for(char c : charArray) {
			if(!charSet.add(c)) {
				dupcharSet.add(c);				
				System.out.println("Duplicate character:"+dupcharSet);
				continue;
			}
		}
			charSet.removeAll(dupcharSet);
			for(char c:charSet) {
				if(c != ' ') {
					System.out.println("Remaining Character:"+charSet);
					break;
				}
			}
		
		
		
	}

}
