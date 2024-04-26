package superkeyword;

public class SuperEx1 extends SuperEx {
	public void addition() {
		super.addition();
		if (sum%10==0) {
			System.out.println(sum+" is divisible by 10");
		}
		else {
			System.out.println(sum+" is not divisible by 10");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperEx1 obj=new SuperEx1();
		obj.addition();
	}

}
