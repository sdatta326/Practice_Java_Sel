class switch_cl
{
	public static void main(String args[])
	{
		int i=10;
		String s="hello";
		String st="";
		int k=1;
		switch(s)
		{
		case "hello":
		{
			switch(k)

			{
			case 1:System.out.println("nice to meet u");
			break;
			case 2:System.out.println("nice to see u");

			}


		}

		break;
		case "world":
		{

			switch(k)

			{
			case 10:System.out.println("the end 1");
			break;
			case 20:System.out.println("the end 2");

			}
			break;
		}
		
		}
		System.out.println(s);
	}
}

