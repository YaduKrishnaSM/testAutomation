package testAutomation;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4,5,1,6,7,4,3,2,5,2,3,4,2,};
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int Arr : num) {
			set.add(Arr);
		}
		System.out.println(set);

	}

}
