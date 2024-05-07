package encapsulation;

public class Bank {
	private int pin;
	
	public void setPin(int pin) {
		this.pin=pin;
	}
	public void getPin() {
		System.out.println(pin);
	}

}
