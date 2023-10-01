package suriyatasks;


public class Main extends Vehicles{

	public Main(String model, int year, String make) {
		super(model, year, make);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Car c1 = new Car("dezire", "maruthi", 2020, 14);
     c1.display();
    
     Motorcycle m1  = new Motorcycle("hero", 2020, "Logo", 200);
     m1.display();
	}

}