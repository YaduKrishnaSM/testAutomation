package testAutomation;

public class Assign_Revserse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String Name ="Yadu krishna";
         String Reverse ="";
         for(int i = Name.length()-1;i>=0;i--) {
        	Reverse += Name.charAt(i);
         }
         System.out.println(Reverse);
         }

}
