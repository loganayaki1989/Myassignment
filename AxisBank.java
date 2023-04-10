package week3.day1;



public class AxisBank extends Bankinfo{
	
	public void deposit()
	{
		System.out.println("Fifty thousand rupees deposited in the saving accounts");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank customer=new AxisBank();
		customer.saving();
		customer.fixed();
		customer.deposit();
	}

}
