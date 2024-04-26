package polymorphism;

public class Onseason extends Offseason{
	
	public void discount() {
		System.out.println("Total Price : "+totprice);
		super.discount();
		
		System.out.println("Onseason Rate");
		double onprice=0.40*totprice;
		System.out.println("Discount amount= "+onprice);
		double totamnt=totprice-onprice;
		System.out.println("Total price to be paid after discount : "+totamnt);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Onseason obj=new Onseason();
		obj.discount();
	}

}
