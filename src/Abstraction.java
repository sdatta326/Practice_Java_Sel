abstract  class Sal
{
	int m;
	int gdp;
	
	int calshow(int m,int gdp)//non abstract method
	{
		this.m=m;
		this.gdp=gdp;
		return m+gdp;
	}
	
	abstract int  salshow();//abstract method
	
		
	
}

class Manager extends Sal// the class which is extending abstract class have to implement all its abstract methods
{
	int etm=50;
	int salshow()
	{
		return calshow(100,50)+etm;
		
	}
}

class Professor extends Sal
{
	int etp=40;
	int salshow()
	{
		
		return calshow(400,50)+etp;	
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sal o1=new Manager();
		//o1.calshow(100,100);
		Sal o2=new Professor();
		//o2.calshow(200,200);
		Manager m=new Manager();
		//m.calshow(10,10);m.calshow(10,10);
		//m.salshow();
		Professor p=new Professor();
		//p.calshow(20,20);
		//p.salshow();
		System.out.println(o1.calshow(100,100)+" "+o2.calshow(200,200)+" "+m.calshow(10,10)+" "+m.salshow()+" "+p.calshow(20,20)+" "+p.salshow());
		
		//u cannot initiate an abstract class that is u cannot create object of abstratc class to access properties and methods of abstract class

	}

	

}
