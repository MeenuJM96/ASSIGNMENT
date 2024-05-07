package interfaceEx;

public class HDFC implements RBI {

	@Override
	public void recurringDeposit(double amount, int duration) {
		// TODO Auto-generated method stub
		double simpleInterest=amount*duration*interest;
		double tot_amnt=amount+simpleInterest;
		System.out.println("Amount you will get back after "+duration+"years : "+tot_amnt);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC obj=new HDFC();
		obj.recurringDeposit(50000,10);
	}

}
