package testAutomation;

public class Numberswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int Number = 1212;
		String ToString =Integer.toString(Number);
        String reverse = new StringBuilder(ToString).reverse().toString();
        int NewNumber = Integer.parseInt(reverse);
        
        if (NewNumber==Number) {
        	System.out.println("Number is palindrome");
        	
        }else {
        	System.out.println("Number is NOT palindrome");
        }

	}

}
