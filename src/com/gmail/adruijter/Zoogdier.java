package com.gmail.adruijter;

public class Zoogdier 
{
	// Fields
	private String nameSpecies;
	private int amountOfLegs;
	private String sound;
	private String favoriteFood;
	private short lifeExpectancy;
	
	
	// Properties 
	//getter
	public String getNameSpecies()
	{
		return this.nameSpecies;
	}
	public void setNameSpecies(String nameSpecies)
	{
		this.nameSpecies = nameSpecies;
	}
	public int getAmountOfLegs()
	{
		return this.amountOfLegs;
	}
	//setter
	public void setAmountOfLegs(int amountOfLegs)
	{
		this.amountOfLegs = amountOfLegs;
	}	
	public String getSound()
	{
		return this.sound;		
	}
	public void setSound(String sound)
	{
		this.sound = sound;
	}
	public String getFavoriteFood()
	{
		return this.favoriteFood;		
	}
	public void setFavoriteFood(String favoriteFood)
	{
		this.favoriteFood = favoriteFood;
	}
	public short getLifeExpectancy()
	{
		return this.lifeExpectancy;
	}
	public void setLifeExpectancy(short lifeExpectancy)
	{
		this.lifeExpectancy = lifeExpectancy;
	}
	
	// Constructor
	// Default Constructor
	
	public Zoogdier()
	{
		this.amountOfLegs = 4;
		this.sound = "OekieBoekieDada";
		this.favoriteFood = "Banaan";
	}
	
	public Zoogdier(int amountOfLegs, String sound, String favoriteFood)
	{
		this.amountOfLegs = amountOfLegs;
		this.sound = sound;
		this.favoriteFood = favoriteFood;
		
	}
	
	public Zoogdier(int amountOfLegs, String sound, String favoriteFood, String nameSpecies, short lifeExpectancy )
	{
		this.amountOfLegs = amountOfLegs;
		this.sound = sound;
		this.favoriteFood = favoriteFood;
		this.nameSpecies = nameSpecies;	
		this.lifeExpectancy = lifeExpectancy;
	}
	
	// Methods
	public void ShowProps()
	{
		System.out.println(String.format("\r\n++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n" +
										 "Ik ben een: %s \r\n" + 
										 "Ik heb maar liefst %s benen \r\n" + 
										 "Ik maak het volgende geluid: %s \r\n" + 
										 "Mijn lievelingsvoedsel is: %s \r\n" + 
										 "De levenverwachting van een %s is: %s\r\n" +
										 "++++++++++++++++++++++++++++++++++++++++++++++++++++++\r\n",
										 this.nameSpecies,
										 this.amountOfLegs,
										 this.sound, 
										 this.favoriteFood,
										 this.nameSpecies,
										 this.lifeExpectancy));
	}
}
