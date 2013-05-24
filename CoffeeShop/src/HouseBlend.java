public class HouseBlend extends CoffeeBeverage
{
	public HouseBlend(Beverage bev) 
	{
		b = bev;
		this.recipe = bev.recipe;
	}

	public double getCost()
	{
		return b.getCost() + .8;
	}
	
	public String getDescription()
	{
		return "house blend";
	}
}