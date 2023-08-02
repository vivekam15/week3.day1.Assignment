package week3.day2Assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int a=0;
		
		for (int i = 0; i<= arr.length; i++) {
			a=i+1;
		
			if(arr[i]!=a) {
				  System.out.println("Missing element: "+a);
				  break;
			  }
			  }
		}
}


