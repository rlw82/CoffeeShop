public class TeaBased extends SizeFactor
{
	public TeaBased(Size size)
	{
		this.drinkSize = size;
	}
	
	public double getCost()
	{
		switch(this.drinkSize){
		case small:
			return .2;
		case medium:
			return .5;
		case large:
			return .7;
		default:
			return 0;
		}	
	}
}