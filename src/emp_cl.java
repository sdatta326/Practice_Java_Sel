import java.util.Scanner;

public class emp_cl {
	String s;
	int a;
	 static  int r=100;
	/*public void accept()
	{
		Scanner sc=new Scanner(System.in);
		
		s=sc.next();
		sc.nextLine();
		a=sc.nextInt();
		
		
	}*/
	 
	 emp_cl()
	 {
		 System.out.println("default constructor");  
	 }
	 emp_cl(String s,int a)
	 
	 {
		 
		 this.s=s;
		 this.a=a;
		 //System.out.println(s+" "+a); 
	 }
	
	public void display()
	{
		System.out.println(s+" "+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		emp_cl o=new emp_cl();
		emp_cl o1=new emp_cl("ram",10);
		//o.accept();
		o.display();
		o1.display();
		//System.out.println(emp_cl.r);
				

	}

}
