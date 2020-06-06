public class zhishu{
	public static void main(String [] args)
	{
		for(int i=2;i<=100;i++)
		{
			int sqrt=(int)Math.sqrt(i);
			int j=0;
			for(j=2;j<=sqrt;j++)
			{
				if(i%j==0)
					break;
			}
			if(j>sqrt)
				System.out.println(i);
		}
		
		
	}
	
	
	
}