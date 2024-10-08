package testAutomation;

import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] Num= {1,2,3,0,0,4,5,0,4,7,0,0};
		Integer [] Result = new Integer[Num.length];
		
		int NonZero = Num.length-1;
		int Zero = 0;
		
		for (int i=0;i <=Num.length-1;i++) {
			if(Num[1]!=0) {
				Result[NonZero]=Num[1];
				NonZero--;
			}else {
				Result[Zero]=Num[i];
				Zero++;
			}
		}
		System.out.println(Arrays.toString(Result));
		

	}


}
