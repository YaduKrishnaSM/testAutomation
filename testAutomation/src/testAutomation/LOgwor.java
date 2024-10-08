package testAutomation;

public class LOgwor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String SMART ="Budget and Management ";
		String SecLong = findlongW(SMART);
		System.out.println(SecLong);

	}
	public static String findlongW(String sentence) {
		String [] word = sentence.split(" ");
		String longW="";
		String SecLong="";
		for (String arr : word) {
			if (arr.length() > SecLong.length() && arr.length() < longW.length()) {
				SecLong=longW;
			}else if (arr.length() > longW.length()){
				SecLong =longW;
				longW =arr;
				
			}
			
		}
		return SecLong;
	}

}