package inheritance;

public class EmpSalaryC extends EmpSalaryB{
	double totsalary;
	public void salary() {
		totsalary=(basicpay+hra-pf-deduction+bonus);
	}
	public void printslip() {
		System.out.println();
		System.out.println("Employee Salary Slip");
		System.out.println("--------------------");
		System.out.println("Basic Pay : "+basicpay);
		System.out.println("Deduction : "+deduction);
		System.out.println("HRA : "+hra);
		System.out.println("Provident Fund : "+pf);
		System.out.println("Bonus Amount : "+bonus);
		System.out.println("Total Salary by hand : "+totsalary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpSalaryC ob=new EmpSalaryC();
		ob.display();
		ob.calc();
		ob.salary();
		ob.printslip();
	}

}
