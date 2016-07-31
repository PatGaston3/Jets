package project;

public class Jet {
	// Fields
	private String model;
	private double speed;
	private double range;
	private String price;
	private Type type;
	
	// Constructors
	public Jet() {}
	
	public Jet(String model, String price, double speed, double range, Type type) {
		this.model = model;
		this.price = price;
		this.speed = speed;
		this.range = range;
		this.type = type;
	}

	// Methods
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	public void getMach() {
		double mach = this.getSpeed() / 760.56;
		if (this.getSpeed() < 760.56) {
			System.out.println("Subsonic");
		}else {
			mach = this.getSpeed() / 760.56;
			System.out.println((int)mach);
		}
		
	}
	
	public void specs() {
		System.out.println("Model: " + this.getModel() + " (" + this.type + ")");
		System.out.println("Price: $" + this.getPrice());
		System.out.print("Speed: (MPH): " + this.getSpeed() +" | (Mach): ");
		this.getMach();
		System.out.println("Range: " + this.getRange() + " nautical miles");
		System.out.println("");
	}
	
}
