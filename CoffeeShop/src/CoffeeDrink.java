public class CoffeeDrink implements Recipe
{
	public String getType()
	{
		return "Coffee";
	}
	
	public void prepare(Beverage b) {
		if(b.getBeverage() == null)
			System.out.println("Add Coffee\nAdd Water");
		else 
		{
			if(b.getDescription().equals("milk"))
			{
				System.out.println("Steaming milk");
				prepare(b.getBeverage());
				System.out.println("Mixing milk and coffee");
			}
			else
			{
				prepare(b.getBeverage());
				System.out.println("Adding " + b.getDescription());
			}
		}
	}
}