class Vehicle{
	private String mark;
	private String color;
	private int year;
	private String model;
	
	public Vehicle(String mark, String color, int year, String model){
		this.mark = mark;
		this.color = color;
		this.year = year; 
		this.model = model;
	}
	
	public void printDetails(){
		System.out.println("Manufacturer: " + mark);
		System.out.println("color: " + color);
		System.out.println("Year: " + year);
		System.out.println("Model:" + model);
	}
	
}

class Car extends Vehicle{
	private String bodyStyle;
	public Car(String mark, String color, int year, String model, String bodyStyle){
		super(mark, color, year, model);
		this.bodyStyle = bodyStyle;
		
	}
	
	public void carDetails(){
		printDetails();
		System.out.println("Body Style: " + bodyStyle);
	}
}

class inherit_java{
	
	public static void main(String [] args){
		Car elantraSedan = new Car("Hyundai", "Blue", 2021, "Elantra", "Sedan");
		elantraSedan.carDetails();
	}
}