package testAutomation;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bank obj =new Bank();
       // obj.cashwithdraw(1245678,5555,1500);
        obj.updatePin(1245678,5555, 3333);
        obj.cashwithdraw(1245678,0,1500);
	}

}
