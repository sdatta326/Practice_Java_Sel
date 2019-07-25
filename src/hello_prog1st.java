
public class hello_prog1st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		float f=a;
		float ft=10.5f;
		int at=(int)ft; //type casting
		byte m=10;
		byte n=20;
		byte c=(byte)(m+n);
		float s=a+ft;
		
		System.out.println("hello"+ft+" "+at+"  "+m+" "+n+" "+"sum ="+" "+s);
		
		header_subclass h=new header_subclass();
		System.out.println(h.show_header());
		
		
		
	}

}
//save the file hello_prog.java
//to compile javak hello_prog.java  compile .java file to .class file (in byte code)
//to run java hello_prog
