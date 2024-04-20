package inheritance;
import java.util.*;

public class EmpSalaryA {
	int basicpay;
	float deduction;
	int bonus; 
	public void display() {
		System.out.print("Enter Basic Pay : ");
		Scanner obj=new Scanner(System.in);
		basicpay=obj.nextInt();
		System.out.print("Enter Deduction : ");
		Scanner obj1=new Scanner(System.in);
		deduction=obj1.nextFloat();
		System.out.print("Enter Bonus : ");
		Scanner obj2=new Scanner(System.in);
		bonus=obj2.nextInt();
	}
}
