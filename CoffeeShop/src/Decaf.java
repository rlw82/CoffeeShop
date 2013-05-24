public class Decaf extends CoffeeBeverage
{
	public Decaf(Beverage bev) 
	{
		b = bev;
		this.recipe = bev.recipe;
	}

	public double getCost()
	{
		return b.getCost() + .5;
	} 	
	
	public String getDescription()
	{
		return "decaf";
	}
}