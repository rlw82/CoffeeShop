public class Espresso extends CoffeeBeverage
{
	public Espresso(Beverage bev) 
	{
		b = bev;
		this.recipe = bev.recipe;
	}

	public double getCost()
	{
		return b.getCost() + 1;
	} 
	
	public String getDescription()
	{
		return "espresso";
	}
}