package testAutomation;

public class Fibin2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N1 = 0;
		int N2 = 1;
		int N3;
		
	   for (int i = 0; i<10;i ++) {
		   N3 = N2 + N1;
		   if (i < 9) {
			   System.out.print(N3+","); 
		   }else {
			   System.out.print(N3); 
 
		   }
		   
		   N1= N2;
		   N2 =N3;   
	   }

	}

}
