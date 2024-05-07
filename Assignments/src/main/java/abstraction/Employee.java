package abstraction;

public abstract class Employee {
	public double sal_per_hr;
	public abstract void calculateSalary();
	
	public void fullTimeEmp(double sal_per_hr) {
		this.sal_per_hr=sal_per_hr;
		System.out.println("Salary per hour = "+sal_per_hr);
	}
	
}
