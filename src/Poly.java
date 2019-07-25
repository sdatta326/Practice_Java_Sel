class Animal
{
	public void sound()
	{
		System.out.println("animal sound");
	}
}
class Cat  extends Animal
{
	public void sound()
	{
		//super.sound();
		System.out.println("cat sound");
	}
	public void sound10()
	{
		System.out.println("cat10 sound");
	}
}
class Dog extends Animal
{
	public void sound()
	{
		System.out.println("dog sound");
	}
}
public class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Cat();
		a.sound();
		//Cat c=new Cat();
		
		//c.sound();
		//c.sound10();
		
		
		if(a instanceof Cat)
		{
			((Cat)a).sound10();//[downcasting to subclass from super class]
		}
		

	}

}
