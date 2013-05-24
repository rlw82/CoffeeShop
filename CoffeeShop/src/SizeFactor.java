public abstract class SizeFactor 
{
	protected Size drinkSize;
	
	public Size getSize()
	{
		return this.drinkSize;
	}

	public abstract double getCost();
}
