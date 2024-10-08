package testAutomation;

import java.util.HashSet;

public class HasSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       int[] Num = {1,2,3,4,5,5,5,6,7,8,9,1,1,1};
       
       HashSet<Integer> set = new HashSet<Integer>();
       
       for (int Num1 : Num) {
    	   set.add(Num1);
    	   
       }
       System.out.println(set);
		

	}

}
