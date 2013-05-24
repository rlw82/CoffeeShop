public class GreenTea extends TeaBeverage
{
	public GreenTea(Beverage bev) 
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
		return "green tea";
	}
}