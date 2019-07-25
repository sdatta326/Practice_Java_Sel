class Address
{
	int streetno;
	String city;
	String state;
	
	Address(int streetno,String city,String state)
	{
		this.streetno=streetno;
		this.city=city;
		this.state=state;
	}
	
	
	
}
public class Aggregation_EMP {
	
	String name;
	Address a;
	
	
	
	Aggregation_EMP(String name,Address a)
	{
		this.name=name;
		this.a=a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a=new Address(100,"kolkata","westbengal");

		Aggregation_EMP o1=new Aggregation_EMP("ram",a);
		
		System.out.println(o1.name+"  "+" "+o1.a.streetno+"  "+o1.a.city+" "+o1.a.state);
		
	}

}
