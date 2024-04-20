package inheritance;

public class EmpSalaryB extends EmpSalaryA {
	double hra;
	double pf;
	public void calc() {
		hra=0.05*basicpay;
		pf=0.20*basicpay;
	}

}
