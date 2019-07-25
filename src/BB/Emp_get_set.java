package BB;

public class Emp_get_set {
	
	private int empid;
	private String name;
	private Address address;
	
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	public void setEmpDetails()
	{
		setEmpid(100);
		setName("RAM");
		Address a=new Address();
		a.setAddress1("jpnagar");
		a.setCity("delhi");
		a.setCountry("india");
		
		setAddress(a);
		
		
	}
	public void getEmpDetails()
	{
		
		System.out.println("emp id="+getEmpid());
		System.out.println("emp id="+getName());
		//System.out.println("emp id="+getAddress());
		System.out.println("emp id="+address.getAddress1());
		System.out.println("emp id="+address.getCity());
		System.out.println("emp id="+address.getCountry());
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp_get_set e1=new Emp_get_set();
		e1.setEmpDetails();
		e1.getEmpDetails();
		

	}


	
}

class Address
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
