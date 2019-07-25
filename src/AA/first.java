package AA;

import java.util.*;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("Name:" +args[0]);
//System.out.println("Company:" +args[2]);
		Scanner sc= new Scanner(System.in);
		int ob;
		float rr;
		float rrr;
		int tar;
		System.out.println("Enter Over bowled");
		ob=sc.nextInt();
		System.out.println("Over bowled:"+ ob);
		System.out.println("Enter Current run rate");
		rr=sc.nextFloat();
		System.out.println("Current run rate:"+ rr);
		System.out.println("Enter Target");
		tar=sc.nextInt();
		System.out.println("Target:"+ tar);
		rrr=(tar-(rr*ob))/(50-ob);
		System.out.println(rrr);
		sc.close();
	}
} 
