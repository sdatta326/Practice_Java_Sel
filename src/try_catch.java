
public class try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=8;
		int j=0;
		int d;
		
		
		try {
		 //d=i/j;
			//d=10;
			int h=4;
			int l=8;
			int a[]=new int[6];
			
		 System.out.println(a[8]);
			System.out.println(l);
		}
		
		//catch(Exception e)
		//{
			//System.out.println("caught arithmatic exception");
		//}
		catch(ArithmeticException ea)
		{
			System.out.println("caught arithmatic exception");
		}
		catch(IndexOutOfBoundsException eb)
		{
			System.out.println("caught indexbound exception");
		}
		
		//System.out.println("hello world");
		
	
		
finally
		{
		
			System.out.println("hello world finally deleted all cookies ");
		}
		
		System.out.println("hello world  ");

	}

}
