public class MilkFreeCoffeeDrink implements Recipe
{
	public String getType()
	{
		return "Coffee";
	}
	@Override
	public void prepare(Beverage b)
	{
		if(b.getBeverage() == null)
			System.out.println("Add water\nAdd coffee");
		else 
		{
			prepare(b.getBeverage());
			System.out.println("Adding " + b.getDescription());
		}
	}
	
}