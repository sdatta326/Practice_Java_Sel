package BB;

interface testx
{
	void displayX();
}

interface testy extends testx
{
	
	void displayY();
}

/*interface testy
{
	
	void displayY();
}*/

//public class InterfaceProgram implements testx,testy{

public class InterfaceProgram implements testy{

	@Override
	public void displayY() {
		// TODO Auto-generated method stub
		
		System.out.println("hello y");
		
	}

	@Override
	public void displayX() {
		// TODO Auto-generated method stub
		System.out.println("hello x");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceProgram  i=new InterfaceProgram ();
		i.displayX();
		i.displayY();
	}

}
