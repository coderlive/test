import java.util.Scanner;
import java.util.Random;
public class caiquan1
{
	public static void main(String args[])
	{
		System.out.println("**********************");
		System.out.println("**                  **");
		System.out.println("**                  **");
		System.out.println("**   �˻���ս��ʼ   **");
		System.out.println("**                  **");
		System.out.println("**                  **");
		System.out.println("**********************");
		String computer="����";
		System.out.println("��������ҵ�����");
		Scanner scan=new Scanner(System.in);
		String player=scan.next();
		System.out.println(player+"VS"+computer);
		System.out.println("Ҫ��ʼ��?y/n");
		String anwser=scan.next();
		if("y".equalsIgnoreCase(anwser))
		{
			do{
			System.out.println("��Ϸ��ʼ!");
			System.out.println("��ȭ��������:");
			System.out.println("0:ʯͷ 1������ 2:��");
			//��.��ҳ�ȭ
			//��ҵ���XX
			System.out.println("����ҳ�ȭ:");
			int playerFirst=scan.nextInt();
			switch(playerFirst)
			{
				case 0:System.out.println("��ҳ�����ʯͷ");break;
				case 1:System.out.println("��ҳ����Ǽ���");break;
				case 2:System.out.println("��ҳ����ǲ�");break;
				default: System.out.println("����ĳ�ȭ����!");
			}
			Random random=new Random(System.currentTimeMillis());
			int computerFirst=random.nextInt(2)+1;
			switch(computerFirst)
			{
				case 0:System.out.println("���Գ�����ʯͷ");break;
				case 1:System.out.println("���Գ����Ǽ���");break;
				case 2:System.out.println("���Գ����ǲ�");break;
			}
			if(playerFirst==computerFirst)
			{
				System.out.println("ƽ��");
			}
			else if((playerFirst+1)%3==computerFirst)
			{
				System.out.println("���Ӯ");
			}else if(playerFirst>2||playerFirst<0)
			{
				System.out.println("�������Ϸ����,��Ϸ����");
				break;
			}
			else
			{
				System.out.println("����ʤ");
			}
			System.out.println("Ҫ������?y/n");
		anwser=scan.next();
	}while("y".equalsIgnoreCase(anwser));
	System.out.println("��ѡ����ǲ��ټ���,��Ϸ����!");
		}else{
			System.out.println("��Ϸ����!");
		}

		
	}
	
}