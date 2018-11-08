public class PATT5
{
    public static void main(String args[])
    {
        int x;
        for(int i = 1; i <= 7 ; i++)
        {
            if(i>4)
            x = 4 - (i%4);
            else if(i == 4)
            x = 4;
            else
            x = i;
            for(int j = 1 ; j<=x ; j++)
			{
                System.out.print(j);
			}
			for(int j = x-1 ; j>0 ; j--)
			{
				System.out.print(j);
			}
			System.out.println();
        }
    }
}
