package javat;

public class ShowView extends Thread {
    private static int WIDTH=10;
    private static int HEIGHT=5;
    private int showArray[][]=new int [WIDTH+1][HEIGHT+1];//初始化数组
    public ShowView()
    {
        for(int w=1;w<=WIDTH;w++)
        {
            showArray[w][1]=1;
        }
        for(int w=1;w<=WIDTH;w++)
        {
            showArray[w][HEIGHT]=1;
        }
        for(int h=1;h<=HEIGHT;h++)
        {
            showArray[1][h]=1;
        }
        for(int h=1;h<=HEIGHT;h++)
        {
            showArray[WIDTH][h]=1;
        }
    }
    @Override
    public void run() {
           reshow();
    }
    public void reshow()
    {
        for(int i=1;i<=WIDTH;i++)
        {
            for(int j=1;j<=HEIGHT;j++)
            {
                if(showArray[i][j]==1)
                {
                    System.out.printf("*");
                }
                else
                {
                    System.out.printf(" ");
                }
            }
            System.out.println("");
        }

    }
}
