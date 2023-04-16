package week3.day1;

public class Calculator{
	public void add(int a,int b)
	{
	
		System.out.println(a+b);
	}
	public void add(int f,int d,int e)
	{

		System.out.println(f+d+e);
	}
	
	public void mul(int f,int d,int e)
	{
		
		System.out.println(f*d*e);
	}
	public void mul(int a,int b)
	{
		
		System.out.println(a*b);
	}
	

	public static void main(String[] args) {
		Calculator cr=new Calculator();
		cr.add(20,25);
		cr.add(100,200,300);
		cr.mul(20,20);
		cr.mul(10,20,30);
		
		
		// TODO Auto-generated method stub

	}

}
