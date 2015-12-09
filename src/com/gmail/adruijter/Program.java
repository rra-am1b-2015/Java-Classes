package com.gmail.adruijter;

public class Program 
{
	public static void main(String[] args) 
	{
		System.out.println("Les 1 Classes in Java");
		
		Mammal dier, kameel;
		
		
		dier  = new Mammal(8, "HeppieHeppieKluckKluck", "Pinda's", "koe", (short)3);
		dier.setAmountOfLegs(12);
		dier.showProps();
		
		kameel = new Mammal(4, "Hroeaaahhh", "Hooi", "kameel",(short)50);		
		kameel.showProps();
		
		Elephant eddy = new Elephant(1.96F, 4, "RetteketetSchuiftrompet", "Pinda", "Elephant", (short)70);
		eddy.setLifeExpectancy((short)70);
		eddy.showProps();
		
		Whale willy;
		willy = new Whale((short) 3000, 0, "HuuHuu", "Reuzen Inktvis", "Potvis", (short) 23);
		willy.showProps();
		
		Camel cameo;
		cameo = new Camel((byte) 2);
		cameo.showProps();
		
	}
}
