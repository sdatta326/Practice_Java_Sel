class Excep6{  
 public static void main(String args[]){  
 /* try{  
    try{  
     System.out.println("going to divide");  
     int b =39/0;  
    }catch(ArithmeticException e){System.out.println(e);}  
   
    try{  
    int a[]=new int[5];  
    a[5]=4;  
    }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
     
    System.out.println("other statement");  
  }catch(Exception e){System.out.println("handeled");}  
  
  System.out.println("normal flow..");  */
	 
	 try
	 {
		 int a[]=new int[4];
		 a[5]=8;//exception
		try
		{
			int i=10;
			int n=i/0;//exception
		}
		catch(Exception e)
		 {
			System.out.println("exception statement"+e);  
		 }
		
		try
		{
			String s=null;
			s.length();//exception
		}
		catch(Exception e)
		 {
			System.out.println("EXCEPTION statement"+e);   
		 }
		
		System.out.println("under catch block executed");  
	 }
	 catch(Exception e)
	 {
		 System.out.println("ALL EXCEPTIONS statement HANDELED"+e); 
	 }
	 finally 
	 {
		 System.out.println("finally i executed");  
	 }
	 
	 System.out.println("rest of code executed");  
 }  
} 

