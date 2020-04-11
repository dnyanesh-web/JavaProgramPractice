package sampleExample;

public class SuperClass {
	
	int age;
	
	SuperClass(int age)
	{
		this.age=age;
		
	}
	public void getAge()
	{
		System.out.println("The value of the variable named age in super class:"+ age);
	}

}
