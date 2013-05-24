public class CoffeeBased extends SizeFactor
{
	public CoffeeBased(Size size_)
	{
		drinkSize = size_;
	}
	
	public double getCost()
	{
		switch(drinkSize){
		case small:
			return .4;
		case medium:
			return .7;
		case large:
			return 1.0;
		default:
			return -1;
		}	
	}
}