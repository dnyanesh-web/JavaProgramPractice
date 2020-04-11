package objectorientedprogramming;

public class Bicycle {
	
	public int gear;
	public int speed;
	
	public Bicycle(int gear,int speed)
	{

		this.gear=gear;
		this.speed=speed;
	}
	
	public void applyBreak(int decre)
	{
		speed -=decre;
	}
	public void speedUp(int incre)
	{
		speed -=incre;
	}
	
	public String toString()
	{
		return "------"+gear+"-------"+speed;
	}


}
