package com.gmail.adruijter;

public class Whale extends Mammal
{
	// Fields
	private short divingDepth;
	
	// Properties
	public short getDivingDepth()
	{
		return this.divingDepth;
	}
	public void setDivingDepth(short divingDepth)
	{
		this.divingDepth = divingDepth;
	}
	
	// Constructor
	public Whale(short divingDepth, int amountOfLegs, String sound, 
					String favoriteFood, String nameSpecies, short lifeExpectancy)
	{
		super(amountOfLegs, sound, favoriteFood, nameSpecies, lifeExpectancy);
		this.divingDepth = divingDepth;		
	}
	
	//Methods (showProps)
	
	@Override
	public void showProps()
	{
		System.out.printf("Mijn duikdiepte bedraagt %s meter", this.divingDepth);
		super.showProps();
	}	
}
