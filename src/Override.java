
public class Override {
	
	public void myMethod()
	   {
		System.out.println("Overridden method");
	   }	   
	}
	class Demo extends Override{
	   public void myMethod(){
		//This will call the myMethod() of parent class
		super.myMethod();
		System.out.println("Overriding method");
	   }
	   public static void main( String args[]) {
		Demo obj = new Demo();
		obj.myMethod();
	   }

}
