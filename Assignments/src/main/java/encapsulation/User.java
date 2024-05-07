package encapsulation;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj=new Bank();
		obj.setPin(1001);
		obj.getPin();
		obj.setPin(1234);
		obj.getPin();
		obj.setPin(1212);
		obj.getPin();
	}

}
