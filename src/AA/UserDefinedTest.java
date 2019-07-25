package AA;

class SalaryException extends Exception
{
	SalaryException()
	{
		super();
	}
	SalaryException(String msg)
	{
		super(msg);
	}
}

public class UserDefinedTest  {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int sal=-3000;
			if(sal<0)
				throw new SalaryException("salary cannot be less then zero");
			else
				System.out.println(sal);
				
			
		}
		catch(SalaryException e)
		{
			System.out.println(e);
		}

	}

}
