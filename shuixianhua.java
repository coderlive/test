public class shuixianhua
{
	public static void main(String args[])
	{
		for(int i=100;i<1000;i++)
		{
			int ge=i%10;
			int shi=i%100/10;
			int bai=i/100;
			if((Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3))==i)
			{
				System.out.println(i+"是水仙花数");
			}
		}
	}
}