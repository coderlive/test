import java.util.Scanner;
import java.util.Random;
public class caiquan1
{
	public static void main(String args[])
	{
		System.out.println("**********************");
		System.out.println("**                  **");
		System.out.println("**                  **");
		System.out.println("**   人机对战开始   **");
		System.out.println("**                  **");
		System.out.println("**                  **");
		System.out.println("**********************");
		String computer="刘备";
		System.out.println("请输入玩家的姓名");
		Scanner scan=new Scanner(System.in);
		String player=scan.next();
		System.out.println(player+"VS"+computer);
		System.out.println("要开始吗?y/n");
		String anwser=scan.next();
		if("y".equalsIgnoreCase(anwser))
		{
			do{
			System.out.println("游戏开始!");
			System.out.println("出拳规则如下:");
			System.out.println("0:石头 1：剪刀 2:布");
			//五.玩家出拳
			//玩家的是XX
			System.out.println("请玩家出拳:");
			int playerFirst=scan.nextInt();
			switch(playerFirst)
			{
				case 0:System.out.println("玩家出的是石头");break;
				case 1:System.out.println("玩家出的是剪刀");break;
				case 2:System.out.println("玩家出的是布");break;
				default: System.out.println("错误的出拳规则!");
			}
			Random random=new Random(System.currentTimeMillis());
			int computerFirst=random.nextInt(2)+1;
			switch(computerFirst)
			{
				case 0:System.out.println("电脑出的是石头");break;
				case 1:System.out.println("电脑出的是剪刀");break;
				case 2:System.out.println("电脑出的是布");break;
			}
			if(playerFirst==computerFirst)
			{
				System.out.println("平局");
			}
			else if((playerFirst+1)%3==computerFirst)
			{
				System.out.println("玩家赢");
			}else if(playerFirst>2||playerFirst<0)
			{
				System.out.println("错误的游戏规则,游戏结束");
				break;
			}
			else
			{
				System.out.println("电脑胜");
			}
			System.out.println("要继续吗?y/n");
		anwser=scan.next();
	}while("y".equalsIgnoreCase(anwser));
	System.out.println("您选择的是不再继续,游戏结束!");
		}else{
			System.out.println("游戏结束!");
		}

		
	}
	
}