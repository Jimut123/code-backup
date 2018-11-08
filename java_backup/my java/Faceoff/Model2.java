import java.io.*;
class Model2
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,j;
        for(i=1;i<5;i++)
        {
            for(j=5;j>0;j--)
            {
                System.out.print(j);
            }//End of for
            System.out.println(" ");
        }//End of for
    }//End of main()
}//End of class

            