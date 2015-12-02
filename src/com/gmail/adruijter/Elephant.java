package com.gmail.adruijter;

public class Elephant extends Zoogdier 
{
	//Fields
	private float trunkLength;
	
	//Properties
	//getter
	public float getTrunkLength()
	{
		return this.trunkLength;
	}	
	//setter
	public void setTrunkLength(float trunkLength)
	{
		this.trunkLength = trunkLength;
	}
	//Constructor
	
	public Elephant(float trunkLength, int amountOfLegs, String sound, String favoriteFood, String nameSpecies, short lifeExpectancy)
	{
		super(amountOfLegs, sound, favoriteFood, nameSpecies, lifeExpectancy);
		this.trunkLength = trunkLength;
	}
	
	// Methods
	//showProps
	public void showProps()
	{
		System.out.printf("Mijn slurflengte is: %s (m)", Float.toString(this.trunkLength));
		super.ShowProps();
	}
	
}
