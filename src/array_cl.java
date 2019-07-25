
public class array_cl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
int a[][]=new int[2][3];

int count=0;
/*for(int r=0;r<2;r++)
{
	for(int c=0;c<3;c++ )
	{
		a[r][c]=count=count+1;
	}
	
}*/

for(int r=0;r<2;r++)//row
{
	for(int c=0;c<3;c++ )//column
	{
		System.out.print(a[r][c]);
	}
	
}

	}

}
