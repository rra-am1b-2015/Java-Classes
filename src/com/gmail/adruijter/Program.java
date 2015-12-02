package com.gmail.adruijter;

public class Program 
{
	public static void main(String[] args) 
	{
		System.out.println("Les 1 Classes in Java");
		
		Zoogdier dier, kameel;
		
		
		dier  = new Zoogdier(8, "HeppieHeppieKluckKluck", "Pinda's", "koe", (short)3);
		dier.setAmountOfLegs(12);
		dier.ShowProps();
		
		kameel = new Zoogdier(4, "Hroeaaahhh", "Hooi", "kameel",(short)50);		
		kameel.ShowProps();
		
		Elephant eddy = new Elephant(1.96F, 4, "RetteketetSchuiftrompet", "Pinda", "Elephant", (short)70);
		eddy.setLifeExpectancy((short)70);
		eddy.showProps();
	}
}
