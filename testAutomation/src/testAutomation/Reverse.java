package testAutomation;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Name = "Yadukrishna";
		//String Reversed = Stringreverse(Name);
		String reverse ="";
		for (int i = Name.length()-1;i>=0;i--) {
			reverse += Name.charAt(i);
		}
		System.out.println(reverse);
	
	}

}
