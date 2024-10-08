package testAutomation;

public class TestAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1230321;
        
       int org = num;
       int reverse = 0;
       while (org !=0) {
    	   int digit = org % 10;
    	   reverse = reverse * 10 +digit;
    	   org= org /10;
       }
       if(num == reverse) {
    	   System.out.println(num + " is a palindrome number");
       }else {
    	   System.out.println(num+ "is not a pailindrom number");
       }
	}

}
