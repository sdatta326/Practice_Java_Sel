
public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		Integer io=Integer.valueOf(a);//converting int primitive type  to Integer object autoboxing or boxing
		System.out.println(io);
		int b=io.intValue();//converting Integer object to integer primitive type unboxing
		System.out.println(io);
		//String s="123";
		String x="1230";
		int i=Integer.parseInt(x);
		System.out.println(i);
		Integer k=new Integer(20);//converting primitive or wrapper into string
		String s4=k.toString();//converting  wrapper into string non static method toString();
		System.out.println(s4+s4+"hello");
		//converting primitive  into string toString() static method
		int n=40;
		String s6=Integer.toString(n);
		System.out.println(s6+10);
		
		
		
		
		
		

	}

}
