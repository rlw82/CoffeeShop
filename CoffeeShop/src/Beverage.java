public abstract class Beverage {
	SizeFactor size;
	Recipe recipe;
	protected Beverage b;
	public double getCost()
	{
		return size.getCost();
	}
	
	public abstract String getDescription();
	
	public Recipe getRecipe()
	{
		return this.recipe;
	}
	
	public void prepare()
	{
		
	}
	
	public Beverage getBeverage()
	{
		return this.b;
	}
	
	public void setSizeFactor(SizeFactor size_)
	{
		this.size = size_;
	}
	
	public void setRecipe(Recipe recipe_)
	{
		this.recipe = recipe_;
	}
}
