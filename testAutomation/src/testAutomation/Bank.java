package testAutomation;

public class Bank {
	
	
	 static int AccntNumber = 1245678;
	public static int PinnNumber = 5555;
	public static int BlanaceAmount = 200000;
	int OldcardPin;
	
	public  void cashwithdraw(int AccN,int pin,int amount) {
		
		if (AccN ==AccntNumber && pin == PinnNumber) {
			
			int  Total_Balance = BlanaceAmount - amount;
			 System.out.println("Total balance is :" +Total_Balance);
		}
		else if (AccN ==AccntNumber && pin == OldcardPin) {
			System.out.println("This was your last card pin it was changed moments ago");
		}
		else {
			System.out.println("Invalid Cred Bro!!!");
		}
		
		
	}
	public void updatePin (int AccN ,int oldPin, int newPin) {
		if (AccN ==AccntNumber && oldPin ==PinnNumber) {
			int OldcardPin =PinnNumber;
			PinnNumber=newPin;
			System.out.println("ATM Pin number updated succesfullly:" +OldcardPin+ "To" + PinnNumber);
		}

		else {
			System.out.println("Please check the details you have given ");
		}
	}

}
