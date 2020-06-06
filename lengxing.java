public class lengxing{
	public static void main(String args[])
	{
		int len=0;
		//等腰三角型
		for(int i=0;i<5;i++)
		{
			int rightj=5;
			for(int j=0;j<rightj-len;j++)
				System.out.print(" ");
			for(int k=0;k<len*2+1;k++)
				System.out.print("*");
			len++;
			System.out.println();
		}
		len--;
		//等腰三角型
		for(int i=0;i<5;i++)
		{
			int rightj=5;
			for(int j=0;j<rightj-len;j++)
				System.out.print(" ");
			
			for(int k=0;k<len*2+1;k++)
				System.out.print("*");
			
			len--;
			System.out.println();
		}
	}
}