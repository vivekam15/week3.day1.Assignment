package week3.day2Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> company =new ArrayList<String>();
		company.add("HCL");
		company.add("Wipro");
		company.add("Aspire Systems");
		company.add("CTS");
		System.out.println(company);
		int length=company.size();
		System.out.println("Number of Cpmpany:"+length);
		Collections.sort(company);
		System.out.println("Sorted Order:"+company);
		Collections.reverse(company);
		System.out.println("Reverse Order:"+company);
			
		
		}
		
	}


