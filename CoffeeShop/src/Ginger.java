public class Ginger extends Ingredient
{
	public Ginger(Beverage b)
	{
		this.b = b;
		this.recipe = b.recipe;
	}
	
	public double getCost()
	{
		return this.b.getCost() + .6;
	}

	@Override
	public String getDescription()
	{
		return "ginger";
	}
	
}