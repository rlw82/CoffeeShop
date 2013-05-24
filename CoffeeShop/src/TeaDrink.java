public class TeaDrink implements Recipe
{
	public String getType()
	{
		return "Tea";
	}

	public void prepare(Beverage b) {
		if(b.getBeverage() == null)
			System.out.println("Add Water\nAdd Tea");
		else 
		{
			if(b.getDescription().equals("milk"))
			{
				prepare(b.getBeverage());
				System.out.println("Mixing milk and tea");
			}
			else
			{
				prepare(b.getBeverage());
				System.out.println("Adding " + b.getDescription());
			}
		}
		
	}
	
}