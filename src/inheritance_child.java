
public class inheritance_child  extends inheritance_parentcl{//single inheritance

	
	int age=20;
		
		public static void main(String args[])//program starts execution from this class so to acess other methods and variables data members 
		//of other class you have to create objects  of those classes here in this main class only
		{
			int age=20;
			inheritance_parentcl o1=new inheritance_parentcl();
			System.out.println("me son maintains  parent properties my city and country are "+" "+o1.city+" "+o1.country+" "+"my age"+" "+age);
			 grandchild o3=new  grandchild();
			 o3.show();
			 grandchild o4=new  grandchild();
			 o4.show();
		}
		 

	

}
class grandchild extends  inheritance_child//multilevel inheritance
{
	int age2=10;
	inheritance_child o2=new inheritance_child();
	
	public void show()
	{
		System.out.println("grandson age"+" "+age2+"city and country for multilevel"+" "+o2.city+" "+o2.country+" "+"parent age"+" "+o2.age);
	}
	
	
}

class grandchild2 extends  inheritance_child//Hierarchical inheritance
{
	int age4=16;
	inheritance_child o2=new inheritance_child();
	
	public void show()
	{
		System.out.println("grandson age"+" "+age4+"city and country for multilevel"+" "+o2.city+" "+o2.country+" "+"parent age"+" "+o2.age);
	}
	
	
}
