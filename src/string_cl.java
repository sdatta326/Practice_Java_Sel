
public class string_cl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="hello world";
		char c=s.charAt(2);
		String sub=s.substring(6);
		int i=s.indexOf("w");
		//System.out.println(s+" "+c+" "+i);
		
		String st="madam";
		
		System.out.println(40+60+st+40+60);
		
		String rs="";
		
		char[] ch={'m','a','d','a','m'};
		String sv=new String(ch);
		
		
		for(int j=st.length()-1;j>=0;j--)
		{
			rs=rs+st.charAt(j);
		}
		
		System.out.println(st);
		System.out.println(rs);
		
		if(st.equals(rs))
		{

			System.out.println("it is palindrome");
		}
		else

			System.out.println("it is not palindrome");
		
		
		
		
		String ss="  SachinTendulkar";  
		   //System.out.println(ss.substring(6));//Tendulkar  
		   //System.out.println(ss.substring(0,5));//Sachin
		System.out.println(ss);
		   System.out.println(ss.trim());
		
		
	}

}
