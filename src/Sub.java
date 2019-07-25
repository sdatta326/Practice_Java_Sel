class Supe
{
	int p=100;
	
	void method()
	{
		System.out.println("parent method");	
	}
	
	void methodP()
	{
		System.out.println("parent only method");
	}
}
public class Sub  extends Supe{
	
	int s=50;
	
	void method()
	{
		System.out.println("parent class same name subclass method");
	}
	
	void extra()
	{
		System.out.println("subclass unmatched extra method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supe p1=new Sub();//upcasting
		
		p1.methodP();//u can call parent class method using upcasting which is not possible if u create parent class referance variable 
		//and storing subclass object type in it
		
		System.out.println("parent class variable="+p1.p);//parent class variable as compile time always 
		//access parent class variable and print it and not child class variable
		
		p1.method();
		
		//cannot access child class other method which is not same name as super class  for that need to convert or downcast super class referance 
		//variable to child class (during run time all these things happen)
		
		((Sub)p1).extra();//downcasting
		
		

	}

}
