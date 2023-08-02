package week3.day2Assignment;

public class ReverseTheString {
	public static void main(String[] args) {
		String input = "Amazon development centre,Chennai";
		
		String lowercase=input.toLowerCase();
		String[] split1 = input.split(" ");
		System.out.println(lowercase);
		System.out.println("***********");
		for (int i = 0; i < split1.length; i++) {
			System.out.println(split1[i]);
			
			continue;
			}
		System.out.println(" ************");
		
		 for (int i = split1.length-1; i>=0; i--) {
	    	   
	    	   System.out.print(split1[i]);
		
	}

}
}