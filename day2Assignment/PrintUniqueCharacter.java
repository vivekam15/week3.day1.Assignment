package week3.day2Assignment;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {
	public static void main(String[] args) {
		String name="viveka";
		char[] charArray=name.toCharArray();
		Set<Character> unique= new HashSet<Character>();
		Set<Character> duplicate=new HashSet<Character>();
		for(char c:charArray) {
			if(!unique.add(c)) {
				duplicate.add(c);
				System.out.println("Duplicate character:"+duplicate);
				continue;
				
			}
		}
		unique.removeAll(duplicate);
		for(char c:charArray) {
			if( c != ' ') {
				System.out.println("Unique Character:"+unique);
				break;
			}
		}
	}

}
