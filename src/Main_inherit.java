class Twowheels
{
	int w;
	String type;
	Twowheels(int w,String type)
	{
		this.w=w;
		this.type=type;
	}

	public void  twowheelShow()
	{
		System.out.println("FOR BIKE IS A CLASS TYPE PARENT CLASS Twowheels"+" "+"no of wheels="+w+" "+"type="+type);
	}

}

class Bike extends Twowheels
{
	String c;
	Bike(int w,String type,String c)
	{
		super(w,type);
		this.c=c;
	}
	Engine e=new Engine("ac",100);
	

	public void  bikeShow()
	{
		//System.out.println("subclass bike"+" "+"color="+c);
System.out.println("sub class bike"+" "+"color="+c+" "+"Twowheels"+" "+"no of wheels="+w+" "+"type="+" "+type+" "+"engine type="+" "+e.type+" "+"mile"+" "+e.mile);
		
	}
	
	
	
	

}

class Engine
{
	String type;
	int mile;
	Engine(String type,int mile)
	{
		this.type=type;
		this.mile=mile;
	}
	public void  engineShow()
	{
		System.out.println("FOR ENGINE HAS A RELATIONSHIP WITH SUBCLASS BIKE"+" "+"type="+type+" "+"mile="+mile);
	}
}
public class Main_inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b=new Bike(2,"vehicle","red");
		b.bikeShow();
		b.twowheelShow();
		b.e.engineShow();
		

	}

}
