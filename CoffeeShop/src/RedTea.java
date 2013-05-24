public class RedTea extends TeaBeverage
{
	public RedTea(Beverage bev) 
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
		return "red tea";
	}
}