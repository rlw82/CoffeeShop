
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		if(args.length < 2)
		{
			System.out.println("Invalid args.");
		}
		else
		{
			String bev = args[0].toLowerCase();
			Size size = parseSize(args[1]);
			Beverage b;
			
			switch(bev){
			case "espresso":
				b = new Espresso(new CoffeeBeverage(size));
				break;
			case "decaf":
				b = new Decaf(new CoffeeBeverage(size));
				break;
			case "houseblend":
				b = new HouseBlend(new CoffeeBeverage(size));
				break;
			case "mocha":
				b = new Chocolate(new Espresso(new CoffeeBeverage(size)));
				break;
			case "latte":
				b = new Milk(new Espresso(new CoffeeBeverage(size)));
				break;
			case "cappuccino":
				b = new WhipCream(new Espresso(new CoffeeBeverage(size)));
				break;
			case "decaf mocha":
				b = new Chocolate(new Decaf(new CoffeeBeverage(size)));
				break;
			case "decaf latte":
				b = new Milk(new Decaf(new CoffeeBeverage(size)));
				break;
			case "decaf cappuccino":
				b = new WhipCream(new Decaf(new CoffeeBeverage(size)));
				break;
			case "green tea":
				b = new GreenTea(new TeaBeverage(size));
				break;
			case "red tea":
				b = new RedTea(new TeaBeverage(size));
				break;
			case "white tea":
				b = new WhiteTea(new TeaBeverage(size));
				break;
			case "flower tea":
				b = new Jasmine(new GreenTea(new TeaBeverage(size)));
				break;
			case "ginger tea":
				b = new Ginger(new GreenTea(new TeaBeverage(size)));
				break;
			case "tea latte":
				b = new Milk(new RedTea(new TeaBeverage(size)));
				break;
			default:
				b = new HouseBlend(new CoffeeBeverage(size));
				System.out.println("Houseblend chosen");
			}
			for(int i = 2; i < args.length; i++)
			{
				switch(args[i].toLowerCase())
				{
					case "milk":
						b = new Milk(b);
						break;
					case "whipcream":
						b = new WhipCream(b);
						break;
					case "chocolate":
						b = new Chocolate(b);
						break;
					case "ginger":
						b = new Ginger(b);
						break;
					case "jasmine":
						b = new Jasmine(b);
						break;	
					case "espresso":
						b = new Espresso(b);
						break;
					case "decaf":
						b = new Decaf(b);
						break;
					case "houseblend":
						b = new HouseBlend(b);
						break;
					case "green tea":
						b = new GreenTea(b);
						break;
					case "red tea":
						b = new RedTea(b);
						break;
					case "white tea":
						b = new WhiteTea(b);
						break;
					default:
						break;
				}
			}
			
			double money = b.getCost();
			System.out.println("Printing Instructions");
			b.getRecipe().prepare(b);
			System.out.println("Printing cost\n$"+money);
		}
	}
	
	public static Size parseSize(String s)
	{
		switch(s.toLowerCase())
		{
			case "small":
				return Size.small;
			case "medium":
				return Size.medium;
			default:
				return Size.large;
		}
	}

}