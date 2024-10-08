package testAutomation;

import java.util.Arrays;

public class Zeroswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	    Integer [] Num = {1,2,3,4,0,0,4,5,7,0,0,8};
		
        Integer [] Result = new Integer[Num.length];
        
        int Zero = 0;
        int NonZero = Num.length-1;
        
        for (int i =0 ; i < Num.length; i++) {
        	if (Num[i] !=0) {
        		Result[NonZero] =Num[i];
        		NonZero--;
         	}else{
         		Result[Zero]= 0;
         		Zero++;
        		
        		
        	}
        	
        }
		
   System.out.println(Arrays.toString(Result));
	}

}
