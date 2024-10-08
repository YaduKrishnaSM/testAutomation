package testAutomation;

public class Reverse2 {
	    public static void main(String[] args) {
	        String input = "string is rev";
	        String output = reverseWordsAndOrder(input);
	        System.out.println(output);  // Output: "versi ni rts"
	    }

	    public static String reverseWordsAndOrder(String str) {
	        String[] words = str.split(" ");
	        StringBuilder reversedString = new StringBuilder();
	        
	        // Reverse the order of the words and reverse each word itself
	        for (int i = words.length - 1; i >= 0; i--) {
	            String reversedWord = new StringBuilder(words[i]).reverse().toString();
	            reversedString.append(reversedWord).append(" ");
	        }
	        
	        // Trim the trailing space
	        return reversedString.toString().trim();
	    }
	}

