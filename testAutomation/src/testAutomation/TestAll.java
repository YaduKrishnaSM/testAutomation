package testAutomation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] Number = {1,0,2,5,4,7,8,0,1,4,0,5,1,6,1,0};
		Integer [] Result = new Integer[Number.length];
		
		int Zero =0;
		int NotZero =Number.length-1;
		
		for (int i =0;i<Number.length;i++) {
			if (Number[i]!=0) {
				Result[NotZero]=Number[i];
				NotZero--;
			}else {
				Result[Zero]=Number[i];
				Zero++;
			}
		}
		System.out.println(Arrays.toString(Result)+" : Zero in Left");
		Unique();
		Fibin();
		Secondlarge();
		PlalindromeNumber();
		LargestNumber();
		LargestfromArray();
	}
	
	public static void Unique() {
		int [] Dup = {1,2,2,4,5,6,6,7,8,7,4,5,1,2,1,2};
		
		Set <Integer> HasSet =new HashSet<>();
		for (int Arr : Dup) {
			HasSet.add(Arr);
		}
		System.out.println(HasSet+" : Uniques");
		
		
	}
	public static void Fibin() {
		int N1=0;
		int N2=1;
		//int N3;
		for (int i =0 ;i<=10;i++) {
			int N3 =N2+N1;
			if (i<10) {
			System.out.print(N3+",");
			}else {
				System.out.print(N3+" : Fibin");
			}
			N1=N2;
			N2=N3;
			
		
					
		}
		System.out.println();
			
	}
	public static void Secondlarge() {
		String Sentence ="FInd the longhest word from the paragraph";
		String Slongest=FindSLng(Sentence);
		System.out.println(Slongest);
	}
	public static String FindSLng(String Sen) {
		String[] Word =Sen.split(" ");
		String Longest="";
		String Slongest="";
		for (String arr : Word ) 
		 {
			if (arr.length() >Longest.length()){
			Slongest =Longest;
	        Longest=arr;
		 }
			else if(arr.length()<Longest.length() && arr.length() >Slongest.length() ) {
			 Slongest=arr;
			 
		 }		 
			
		 }
		return Slongest;
    }

   public static void PlalindromeNumber() {
	   int Num = 122221;
	   String toString= Integer.toString(Num);
	   String reverseed = new StringBuilder(toString).reverse().toString();
	   int Result = Integer.parseInt(reverseed);
	   if (Result==Num) {
		   System.out.println(Num+"  Is  a palindrome number");

	   }else {
	   System.out.println(Num+"  I not a palindrome number");
	   
   }
	   }
   public static int LargestNumber() {
	   int num = 1234567;
	   String CString =Integer.toString(num);
	  // String[] Numb = toString.split(" ");
	   int Largest = 0;
	   for (int i=0; i <CString.length();i++) {
		   
           int digit = Character.getNumericValue(CString.charAt(i));
           if (digit >Largest) {
        	   Largest=digit;
           }
          

			   
		   }
	   System.out.println(Largest);
       return Largest;

	   }
public static void LargestfromArray() {
    int [] Number = {1,2,5,6,7,45,8,9,5,42};
    int large = 0 ;
    for (int arr : Number) {
    	if(arr > large) {
    		large=arr;
    		
    	}
    }
    System.out.println(large);
	
}
   

	   
	   
	   
   
}