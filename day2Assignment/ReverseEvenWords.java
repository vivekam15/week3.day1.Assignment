package week3.day2Assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		String[] split= test.split("");
	
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
		}
		System.out.println("              ");
		
		for (int j =split.length-1; j>=0; j--) {
			System.out.print(split[j]);
			
		}

	}

}
