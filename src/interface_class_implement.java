
public class  interface_class_implement implements interface_cl,interface_cl2_double {
	
	public static void main(String args[])
	{
		interface_class_implement oc=new interface_class_implement();//Object of that class omplement that 
		//interface can have access of interface data memebers like method and own class data members
		interface_cl op=new interface_class_implement();//But object of interface can only have access to interface
		//but not the methods of the class that implement interface
		interface_cl2_double  ob=new interface_class_implement();
		op.check_balance();
		ob.check_balance();
		oc.myownclassmethod();
		oc.check_balance();
		oc.balance_low();
		oc.balance_overloaded();
		oc.check_balance_other_bank();
		oc.balance_low_other_bank();
		oc.balance_overloaded_other_bank();
		
	}
	
	public void myownclassmethod()
	{
		System.out.println("MY OWN CLASS METHOD");
	}

	public void check_balance() {
		System.out.println("check_balance interface methods");
	}
	public void balance_low() {
		System.out.println("balance_low");
	}
	public void balance_overloaded() {
		System.out.println("balance_overloaded");
	}

	//@OORIDE
	public void check_balance_other_bank() {
		// TODO Auto-generated method stub
		System.out.println("check_balance OTHER BANK");
		
	}

	//@OORIDE
	public void balance_low_other_bank() {
		// TODO Auto-generated method stub
		System.out.println("check_balance OTHER BANK");
		
	}

	//@OORIDE
	public void balance_overloaded_other_bank() {
		// TODO Auto-generated method stub
		System.out.println("check_balance OTHER BANK");
		
	}
	

}
