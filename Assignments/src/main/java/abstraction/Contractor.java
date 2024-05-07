package abstraction;

public class Contractor extends Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contractor obj=new Contractor();
		obj.fullTimeEmp(150);
		obj.calculateSalary();
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		int wrkhrs=8;
		double paidsalary = wrkhrs*sal_per_hr;
		System.out.println("Total Salary for 8 hrs = "+paidsalary);
	}

}
