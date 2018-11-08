
            
       

          class Pythagoras
{
    public static void main()
    {
        for(int i=1;i<=100;i++)
        {
            for(int j=i+1;j<=100;j++)
            {
                for(int k=j+1;k<=100;k++)
                {
                    if((i*i+j*j)==(k*k))
                    System.out.println(i+"+"+j+"+"+k);
                }
            }
        }
    }
}