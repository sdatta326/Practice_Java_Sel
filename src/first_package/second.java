/**
 * 
 */
/**
 * @author ibm
 *
 */
package first_package;
import AA.*;

class first
{
	//m a=new m();
	
	modifiers a=new modifiers();
	public void show2()
	{
		System.out.println("public"+a.i);
	}
	
	
	
	
	
	
	
}
public class second extends modifiers
{
	
	
	
	public static void main(String[] args) 
	{
		second a=new second();
		System.out.println("protected"+a.k);
	}
	
}

