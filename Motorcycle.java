package suriyatasks;

public class Motorcycle extends Vehicles  {
    private int topspeed;

	public Motorcycle(String model, int year, String make, int topspeed) {
		super(model, year, make);
		this.topspeed = topspeed;
	}

	public int getTopspeed() {
		return topspeed;
	}

	public void setTopspeed(int topspeed) {
		this.topspeed = topspeed;
	}


public void display() {
	System.out.println("Motorcycle Details :");
	super.display();
	
}
    
}