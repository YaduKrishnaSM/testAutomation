package testAutomation;

import java.util.Arrays;

public class Large {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Sentence = "This is a sentence to check paragraphs the largest word from this paragraph";
		String seclargeword = findlargeword(Sentence);
		System.out.println(seclargeword);

	}
	public static String findlargeword(String word) {
		String [] sents =word.split(" ");
		//System.out.println(Arrays.toString(sent));
		String largeword = "" ;
		String seclargeword = "";
		for (String sent : sents) {
			if (sent.length() > largeword.length() ) {
				seclargeword =largeword;
				largeword =sent;
			}else if(sent.length() >seclargeword.length() && largeword.length()>seclargeword.length() ) {
				seclargeword = sent;
			}
			
		}
		System.out.println(largeword);
		return seclargeword;
		
	}

}
