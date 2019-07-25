package BB;

public class ExceptionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		int i=10;
		int j=10;
		int result=i/j;
		
		String arr[]= {"ram","mahesh","vinod","vinay","sunil"};
		
		System.out.println(result);
		
		 for(int num =0;num<=arr.length;num++)
	            System.out.println(arr[num]);
		 
		 
		 
		 System.out.println("Continue statement");
		}
		catch(ArithmeticException e) {
            System.out.println(e);
		}
		  catch(ArrayIndexOutOfBoundsException e1) {
	            System.out.println(e1);
	        }
            
            
		System.out.println("Continue statement");     
        
		
	}

}
