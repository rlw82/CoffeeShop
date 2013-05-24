public class CoffeeBeverage extends Beverage
{
	public CoffeeBeverage(Size size_)
	{
		size = new CoffeeBased(size_);
		recipe = new MilkFreeCoffeeDrink();
	}
	public String getDescription()
	{
		return "";
	}
	public CoffeeBeverage()
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