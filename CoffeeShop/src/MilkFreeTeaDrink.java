public class MilkFreeTeaDrink implements Recipe
{
	public String getType()
	{
		return "Tea";
	}
	
	@Override
	public void prepare(Beverage b)
	{
		if(b.getBeverage() == null)
			System.out.println("Add water\nAdd tea bags");
		else 
		{
			prepare(b.getBeverage());
			System.out.println("Adding " + b.getDescription());
		}
	}
	
}