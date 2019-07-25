class Parent
{
	int speed=40;
	int age;
	
	Parent()
	{
		
	}
	
	Parent(int age)
	{
		this.age=age;
	}
	
	public void show()
	{
		System.out.println("PRINTING METHOD INSIDE PARENT LEVEL");	
	}
}
public class SuperInh extends Parent {
	
	int speed=80;
	int age;
	
	SuperInh()
	{
		
		
	}
	
	SuperInh(int age1,int age2)
	{
		super(age1);//Super keyword used to call base class constructor
		age=age2;
	}
	
	public void show()
	{
		System.out.println("parent-level="+super.speed);//Program using super keyword al variable level
		super.show();//Super Keyword at Method Level
		System.out.println("PRINTING METHOD INSIDE CHILD LEVEL");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperInh o1=new SuperInh();
		o1.show();
		System.out.println("child-level="+o1.speed);
		SuperInh o2=new SuperInh(50,30);
		
		

	}

}
