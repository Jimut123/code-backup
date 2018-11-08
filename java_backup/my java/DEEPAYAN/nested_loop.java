public class nested_loop
{
    public static void main(String args[])
    {
        int c=1;
        for (int i=5;i>=1;i--)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(j);
            }
            for(int k=4;k>=c;k--)
            {
                System.out.print(i);
            }
            c=c+1;
            System.out.println();
        }
    }
}

        
        