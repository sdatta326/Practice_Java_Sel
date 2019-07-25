class InvalidAgeException  extends Exception
{
	
	InvalidAgeException(String s)
	{
		super(s);
	}
}
public class UserException {
	static int age;
	static  void calage(int age) throws InvalidAgeException
	 {
		
	 	if(age<18)
	 		throw new InvalidAgeException("invalid vote");
	 	else
	 		System.out.println("valid vote");;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
try
{
		UserException.calage(10);
}
catch(InvalidAgeException e)
{
	System.out.println("exception occurred"+e);
}
System.out.println("rest of the code executed after catch handle");
	}

}

//exception occurred InvalidAgeException invalid vote
//rest of the code executed after catch handle
