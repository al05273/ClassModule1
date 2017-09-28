
public class Bicycle extends Vehicle{
	private boolean hasBasket;
	private boolean hasPattern;
	public Bicycle(String color) {
		super(2,color);
		
		// TODO Auto-generated constructor stub
	}
	public String getHasBasket() {
		if (hasBasket) {
			return "Bicycle has a basket ";
		} else {
			return "Bicycle has no basket ";
	
		}
	}	
		
	public void setHasBasket(boolean hasBasket) {
		this.hasBasket = hasBasket;
	}
	public String gethasPattern() {
		if (hasBasket && hasPattern) {
			return "Basket has a floral pattern";
		} else if(hasBasket) {
			return "Basket has no floral pattern ";
		}
		else {
			return "Bicycle has no basket";
		}
	}	
	public void setHasPattern(boolean hasPattern) {
		this.hasBasket = true;
		this.hasPattern = hasPattern;
	}

}
