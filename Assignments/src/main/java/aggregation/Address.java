package aggregation;

public class Address {
	String adrs;
	Student s;

	public Address(String adrs,Student s) {
		this.adrs=adrs;
		this.s=s;
	}
	public void disp() {
		System.out.println("Name:"+s.stname);
		System.out.println("RollNo:"+s.rollno);
		System.out.println("Address:"+adrs);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ob=new Student("Meenu",22);
		Address obj=new Address("ABC House,Tvpm-695001",ob);
		obj.disp();
	}

}
