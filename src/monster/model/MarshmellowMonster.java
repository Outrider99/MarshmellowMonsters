package monster.model;

public class MarshmellowMonster
{
	//Declaration section
	private String name;
	private int eyeCount, armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	
	public MarshmellowMonster()
	{
		
	}
	
	public MarshmellowMonster(String name, int eyeCount, int arms, double tentacleCount, boolean hasBloop)
	{
		this.name = name;
		this.eyeCount = eyeCount;
		this.armCount = arms;
		this.tentacleAmount = tentacleCount;
		this.hasBloop = hasBloop;
	}
	
	
	//Getters, methods that get information from the object
	public String getName()
	{
		return name;
	}
	public int getEyeCount()
	{
		return eyeCount;
	}
	public int getArms()
	{
		return armCount;
	}
	public double getTentacleAmount()
	{
		return tentacleAmount;
	}
	public boolean hasBloop()
	{
		return hasBloop;
	}
	
	//Setters, methods that set values in the objects
	public void setName(String name)
	{
		this.name = name;
	}
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
	}
	public void setTentacleAmount(double tentacleAmount)
	{
		this.tentacleAmount = tentacleAmount;
	}
	public void setBloop(boolean hasBloop)
	{
		this.hasBloop = hasBloop;
	}
	
	//Default out of this class when .toString is called
	public String toString()
	{
		String description = "I am a monster, my name is " + name + ", I have "+ eyeCount + " eyes and only ";
		description += tentacleAmount + " tentacles but I have " + armCount + " arms! " + hasBloop + " tells you";
		description += " if I have a bloop";
		
		return description;		
	}
}
