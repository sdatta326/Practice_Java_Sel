import java.util.Scanner;

public class array_re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		/*int arr[]=new int[2];//single dimentional array
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
		
		int arrr[][]=new int[3][3];
		/*for(int i=0;i<arrr.length;i++)
		{
			for(int j=0;j<arrr.length;j++)
			{
			arrr[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0;i<arrr.length;i++)
		{
			for(int j=0;j<arrr.length;j++)
			{
				System.out.print(arrr[i][j]);
			}
			System.out.println();*/
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
			arrr[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arrr[i][j]);
			}
			System.out.println();
		
		}
		

	}

}
