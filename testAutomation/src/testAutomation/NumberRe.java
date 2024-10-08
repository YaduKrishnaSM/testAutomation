package testAutomation;

public class NumberRe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number = "123456";
		String num ="";
		
		for(int i = 0; i <number.length();i++) {
			char currntchat = number.charAt(i);
			if (currntchat=='3') {
				num += '7';
			}else {
				num+=currntchat;
			}
		}
		System.out.println(num);
		

	}

}
