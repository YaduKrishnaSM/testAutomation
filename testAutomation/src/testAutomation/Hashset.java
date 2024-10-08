package testAutomation;

import java.util.HashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {1,2,3,2,2,5,5,5,8,9,7,8,5,8};
		
		
		
		Set<Integer> distinctNumber =new HashSet<>();
		
		for (int arr : num) {
			distinctNumber.add(arr);
		}
		
		System.out.println(distinctNumber);

	}

}
