package week3.day2Assignment;



public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {3, 2, 11, 4, 6, 7};
		  int[] arr2 = {1, 2, 8, 4, 9, 7};

for (int i = 0; i < arr1.length; i++) {
for (int j = 0; j< arr1.length; j++) {
	
		if (arr1[i]==arr2[j]) {
			  System.out.print(arr1[i] + " ");
			  break;
		}
			
		
	}
	
	
}

	}

}
