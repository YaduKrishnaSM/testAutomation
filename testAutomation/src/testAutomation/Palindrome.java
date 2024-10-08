package testAutomation;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Word = "MALAYALAM";
		String  reversed ="";
		
		for (int i = Word.length()-1; i>=0;i--) {
			 reversed += Word.charAt(i);	
		}
		if (Word.equals(reversed)) {
			System.out.println(Word +" is a palindrome word ");
		}
		else {
			System.out.println(Word +"is not a palindrome word");
		}
		 //System.out.println(reversed);

	}

}
