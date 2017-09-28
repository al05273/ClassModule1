
public class testBicycle {

	public static void main (String args[]) {
		// TODO Auto-generated constructor stub
		Bicycle bike = new Bicycle("blue");
		bike.setHasPattern(false);
		bike.setHasBasket(true);
		System.out.print(bike.getHasBasket() + bike.gethasPattern());
	}

}
