package carProject;

public class CarApp {
	public static void main(String[] args)
	{
		String make = "Ferrari";
		String model = "458";
		double speed = 87;
		String color = "RED";
		String move = "accelerating";
		String function = "turned on";
		
	Car myCar = new Car(make,model,speed,color,move,function);
	
	make = "Lamborghini";
	model = "Gallardo";
	speed = 86;
	color = "White";
	move = "accelerating";
	function = "turned on";
	
	Car myCar2 = new Car(make,model,speed,color,move,function);
	
	
	make = "Toyota";
	model = "4-Runner";
	speed = 12;
	color = "Red";
	move = "deccelerating";
	function = "turned on";
	
	Car myCar3 = new Car(make,model,speed,color,move,function);
	
	System.out.println(myCar.getCarNews());
	System.out.println(myCar2.getCarNews());
	System.out.println(myCar3.getCarNews());
	}
}
//Book myBook = new Book();
		//myBook.setAuthor("Daniel James Brown");
		//myBook.setBookID("Ch101");
		//myBook.setTitle("The Boys On The Boat");
		//myBook.setDescription("Nine Americans and Their Epic Quest for GOLD");
		//myBook.setPrice(19.99);
		//myBook.setTaxable(true);



//String author = "Daniel James Brown";
//String bookID = "CH101";
//String title = "The Boys On The Boat";
//String description = "Nine Americans and Their Epic Quest for Gold";


//make = "";
//model = "";
//speed = 0;
//color = "";
//accelerating = true;
//starting = true;