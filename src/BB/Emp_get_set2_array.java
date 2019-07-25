package BB;

public class Emp_get_set2_array {
	
	private int empid;
	private String name;
	private Addressnew address[]=new Addressnew[2];
	
	Emp_get_set2_array()
	{
		for(int i=0;i<=1;i++)
		{
			address[i]=new Addressnew();
			
		}
	}
	
	
	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	/*public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}*/
	
	
	
	public void setEmpDetails()
	{
		setEmpid(100);
		setName("RAM");
		Addressnew a=new Addressnew();
		a.setAddress1("jpnagar");
		a.setCity("delhi");
		a.setCountry("india");
		
		address[0]=a;
		
		a=new Addressnew();
		
		setEmpid(100);
		setName("RAM");
		//Address a=new Address();
		a.setAddress1("btm");
		a.setCity("bangalore");
		a.setCountry("london");
		
		address[1]=a;
		
		
		
		//setAddress(a);
		
		
	}
	public void getEmpDetails()
	{
		
		System.out.println("emp id="+getEmpid());
		System.out.println("emp id="+getName());
		
		//System.out.println("emp id="+getAddress());
		//System.out.println("emp id="+address.getAddress1());
		//System.out.println("emp id="+address.getCity());
		//System.out.println("emp id="+address.getCountry());
		
		for(int i=0;i<=1;i++)
		{
			//address[i]=new Addressnew();
			//System.out.println("address="+address[i].getAddress1());
			System.out.println("Address: " + address[i].getAddress1());
            System.out.println("City: " + address[i].getCity());
            System.out.println("Country:" + address[i].getCountry());
            System.out.println("----------------");
			
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp_get_set2_array e1=new Emp_get_set2_array();
		e1.setEmpDetails();
		e1.getEmpDetails();
		

	}


	
}

class Addressnew
{
	private String address1;
	private String city;
	private String country;
	
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
