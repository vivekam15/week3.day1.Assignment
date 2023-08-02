package week3.day2Assignment;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		int size = data.length;
		Arrays.sort(data);

		if(data.length>=2) {
			int secondLargest = data[data.length - 2];
			System.out.println("Size of the list: " +size);

			System.out.println("SecondLargestnumber:"+secondLargest);

		}else{
			System.out.println("Array doesn't have a second largest element.");

		}


	}

	
	}


