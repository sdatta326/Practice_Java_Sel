
public class Excep {

	static int i=10;
	static int n;
	static String s=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1st rest of code");
	
		//try,class,interface,finally{}
		try
		{
			n=i/0;
			int[] a=new int[4];
			//a.length;
			//s.length();
			System.out.println(s.length());
			System.out.println(a[5]);
			System.out.println("wihin try rest of code");
		
			
		}
		
		
		
	
		//System.out.println("rest of code");
		
		/*catch(NullPointerException e)
		{
			System.out.println("caught nullpointer excception"+" "+e);	
		}
		catch(ArithmeticException e)
		{
			//System.out.println("caught arithmatic excception");
			System.out.println("caught arithmatic excception"+" "+e);
			//System.out.println("rest of code");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//System.out.println("caught arithmatic excception");
			System.out.println("caught arrayindexoutofboundsexception excception"+" "+e);
			//System.out.println("rest of code");
		}*/
		
		catch(Exception e)
		{
			//System.out.println("caught arithmatic excception");
			System.out.println("caught any excception"+" "+e);
			//System.out.println("rest of code");
		}
		/*catch(ArithmeticException e)//compilation fails as subclass  arithmatic exception must be before superclass exception
		{
			//System.out.println("caught arithmatic excception");
			System.out.println("caught arithmatic excception"+" "+e);
			//System.out.println("rest of code");
		}*/
		finally
		{
			System.out.println("within finally executed");
		}
		System.out.println("after finally rest of code");
		
		
	}

}
//only one try block should be there in program,multiple catch blocks will be there,one finally block be there,
//after one try block one finally or one catch block must be there,in a try block multiple logic statements  would be there 
//but only one exception at a time will be handled.starting from main before try block all statements will be executed,within try block 
//once exception found it will directly go to catch block skipping statements and finally and after finally allstatements will be executed
//if no catch block is there to handle exception then 1st code after main will be executed,2nd try block code exception caught at catch block
//then finally block will execute after that remaining code will be executed