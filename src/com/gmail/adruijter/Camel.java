package com.gmail.adruijter;

public class Camel
{
	// Fields
	private byte amountOfHumbs;
	
	// Properties
	public byte getAmountOfHumbs()
	{
		return this.amountOfHumbs;
	}
	public void setAmountOfHumbs(byte amountOfHumbs)
	{
		this.amountOfHumbs = amountOfHumbs;
	}
	
	// Constructor
	public Camel(byte amountOfHumbs)
	{
		this.amountOfHumbs = amountOfHumbs;
	}
	
	public void showProps()
	{
		System.out.printf("Ik heb maar liefst %s bulten op mijn rug", this.amountOfHumbs);
	}
}
