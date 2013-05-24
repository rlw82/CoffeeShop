public class Chocolate extends Ingredient
{
	public Chocolate(Beverage b)
	{
		this.b = b;
		this.recipe = b.recipe;
	}

	public double getCost() 
	{
		return this.b.getCost() + .3;
	}

	public void prepare()
	{
		System.out.println("Adding Chocolate");
	}
	
	public String getDescription() {
		return "chocolate";
	}
	
}