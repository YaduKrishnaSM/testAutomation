package testAutomation;

public class FindLongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1 = "The quick brown fox jumped over the lazy dog ";
        String[] words = s1.split(" ");
        int max = 0;
        String maxWord = "";
        for(String i : words){
           // System.out.println(i);
            int length = i.length();
             if(length>max){
                 max=length;
                 maxWord = i;
             }
             
        }
        System.out.println("Max length Word: " + maxWord + ", Length: " + max); 
		    }
		

	}


