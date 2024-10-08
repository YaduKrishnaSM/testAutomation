package testAutomation;

public class NumberReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      int Number = 123456;
      String Number_str = Integer.toString(Number);
      String NewString = Number_str.replace("2", "7");
      
      int NewNumber = Integer.parseInt(NewString);
      System.out.println(NewNumber);

	}

}
