class pattern1
{
    public static void main()
    {
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=9;j++)
            {
                if(j==i)
                System.out.print('G');
                else if(j<i)
                System.out.print('@');
                else
                System.out.print('N');
            }
            System.out.println("");
        }
    }
}
                