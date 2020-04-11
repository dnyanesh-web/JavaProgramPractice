package Example_Inheritance;

public class Calculation {
	
	public int z;
	
	public void addition(int x,int y)
	{
		z = x+y;
		System.out.println(z);
	}
	public void substraction(int x,int y)
	{
		z = x-y;
		System.out.println(z);
		
	}
	public void multiplication(int x,int y)
	{
		z = x*y;
		System.out.println(z);
	}
	public void division(int x,int y)
	{
		z = x/y;
		System.out.println(z);
	}

}
