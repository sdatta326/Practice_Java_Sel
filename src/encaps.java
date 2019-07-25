class emp
{
	private int age;
	private double sal;
	 
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	public double getSal()
	{
		
		return sal;
	}
	public void setSal(double sal)
	{
		this.sal=sal;
	}
	
}
public class encaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	emp o1=new emp();
	o1.setAge(20);
	o1.setSal(500.60);
	
	System.out.println("age of emp="+" "+o1.getAge());
	System.out.println("salary of emp="+" "+o1.getSal());
		

	}

}
