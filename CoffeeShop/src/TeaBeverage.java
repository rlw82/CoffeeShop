public class TeaBeverage extends Beverage
{
	public TeaBeverage(Size size_)
	{
		size = new TeaBased(size_);
		recipe = new MilkFreeCoffeeDrink();
	}
	public String getDescription()
	{
		return "";
	}
	public TeaBeverage()
	{
		
	}
	
	public double getCost()
	{
		return size.getCost();
	}
	
	public void prepare()
	{
		
	}
}