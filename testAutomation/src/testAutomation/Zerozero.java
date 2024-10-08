package testAutomation;

import java.util.Arrays;

public class Zerozero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Integer[] Number = {1,2,0,1,0,1,5,0,1,2,0,0,0};
	 Integer[] Result = new Integer[Number.length];
	 
	 
	 int  Zero =0;
	 int NonZero = Number.length-1;
	 for  (int i=0; i<Number.length;i++) {
		 if (Number[i]!=0) {
			 Result[NonZero]=Number[i];
			 NonZero--;
			 
		 }else {
			 Result[Zero]=Number[i];
			 Zero++;
		 }
	 }
	 System.out.println(Arrays.toString(Result));
	 

	}

}
