
public class func {
	int a;
	int b;
	String s;
	
	public void getdata(int a,String s)
	{
		this.a=a;
		this.s=s;
	}
	
	public void showdata()
	{
		System.out.println(a+" "+s);
	}
	
	public int  showdata(int a,int b)
	{
		return a+b;
		//System.out.println(a+" "+s);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
func o1=new func();
o1.getdata(10,"ram");
o1.showdata();
System.out.println(o1.showdata(100,200));
	}

}
