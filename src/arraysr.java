import java.util.Collection;

public class arraysr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {10,20};
		int[] arr1;
		float f[];char c[];long[] al;
		Object[] o;
		Collection[] co;
	
	

		int[] a1=new int[2];
		
		for(int num:arr)
		{
			num=arr[0];
			System.out.println(num);
			
		}
		
		int am[][]=new int[2][4];
		int[][] pm=new int[4][8];
		int po[][][]=new int[2][3][4];
		sum(arr);
		int a[]=show();
		int sum=0;
		for (int i = 0; i < a.length; i++) 
            sum+=a[i]; 
          
        System.out.println("sum of array values : " + sum); 
		
		}
	public static void sum(int[] arr)
	{
		int sum=0;
		for (int i = 0; i < arr.length; i++) 
            sum+=arr[i]; 
          
        System.out.println("sum of array values : " + sum); 
	}
		
	public static int[] show()
	{
		
       return new int[] {10,20}; 
        //System.out.println("sum of array values : " + sum); 
	}
		
		

	

}
