package com.inheritance;

public class Programmer extends Employee{
	
	int bonus = 11000;

	public static void main(String[] args) {
		
		Programmer pr = new Programmer();
		
		System.out.println(pr.bonus);
		System.out.println(pr.salary);
		
		



	}

}
