package carProject; 

public class Car {
	
	
	private String make;
	private String model;
	private double speed;
	private String color;
	private String move;
	private String function;
	

	
	public Car()
	{
	
		make = "";
		model = "";
		speed = 0;
		color = "";
		move = "";
		function = "";
		
	}
	public Car(String make, String model, Double speed, String color,String move,String function)
	{
	
		this.make = make;
		this.model = model;
		this.speed = speed;
		this.color = color;
		this.move = move;
		this.function = function;
		
	}

	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	

	
	
	public String getCarNews()
	{
		return "The car is a " + color+" " + make+" " + model + ".\n" +"The car is " + function + ".\n"
	+ "The car is " + move + "\n"+"The car is going " +speed+" mph.\n";
	}

	
	
}

