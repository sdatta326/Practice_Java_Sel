import java.util.Scanner;

public class switchr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int m;
		m=sc.nextInt();
		switch(m)
		{
		case 10:
			int a=10;
			int b=10;
			System.out.println(a+b+"hello");
			break;

		case 20:System.out.println("world");

		break;
		default:
			System.out.println("default");


		}

	}

}
