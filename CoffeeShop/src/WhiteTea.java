public class WhiteTea extends TeaBeverage
{
	public WhiteTea(Beverage bev) 
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
		return "white tea";
	}
}