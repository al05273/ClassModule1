
public class Vehicle { //base class
	private int numOfWheels;
	private String color;
	
	public Vehicle (int numOfWheels, String color) {
		this.numOfWheels = numOfWheels;
		this.color = color;
		
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
