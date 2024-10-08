package testAutomation;

public class WordOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String Word = "acaradadafaf";
        char Word1 ='a';
        int Count =0;
        for(int i=0;i < Word.length();i++) {
        	if(Word.charAt(i) == Word1) {
        		Count++;
        	}
        }
       System.out.println(Count);
	}

}
