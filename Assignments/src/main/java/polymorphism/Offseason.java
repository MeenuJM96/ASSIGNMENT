package polymorphism;

public class Offseason {
	
	double totprice=5000;
	
	public void discount() {
		double offprice=0.15*totprice;
		System.out.println("Offseason Rate");
		System.out.println("Discount amount= "+offprice);
		double totamt=totprice-offprice;
		System.out.println("Total price to be paid after discount : "+totamt);
	}

}
