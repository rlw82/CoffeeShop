public class WhipCream extends Ingredient
{
	public WhipCream(Beverage b)
	{
		this.b = b;
		this.recipe = b.recipe;
	}

	public double getCost() 
	{
		return this.b.getCost() + .3;
	}

	public String getDescription()
	{
		return "whip cream";
	}
}