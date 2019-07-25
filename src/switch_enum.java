class switch_enum
{
	public enum days {sunday,monday};

	public static void main(String args[])
	{
		days[] d=days.values();
		for(days n:d)
		{
			switch(n)
			{
			case sunday:System.out.println(n);
			break;
			case monday:System.out.println(n);
			break;

			}
		}
	}
}

