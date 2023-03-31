package week1.day2;

public class FibonaaciSeries {

	    public static void main(String[] args) {

	        int range = 8, num1 = 0, num2 = 1;
	        System.out.println("Fibonacci Series of "+range+" numbers:");

	        for (int i = 1; i <= range; ++i)
	        {
	            System.out.println(num1+" ");
	            int sum = num1 + num2;
	            num1 = num2;
	            num2 = sum;
	        }
	    }
	}
