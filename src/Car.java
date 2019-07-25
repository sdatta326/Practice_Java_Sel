class Vehicle
{
	int engine;
	Vehicle(int engine)
	{
		this.engine=engine;
	}
}
public class Car extends Vehicle {
	String type;
	
	Car(int engine,String type)
	{
		super(engine);
		this.type=type;
	}
	
	public void display()
	{
		System.out.println(engine+" "+type);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String type;
		
		Car c=new Car(10,"ac");
		c.display();
		

	}

}
