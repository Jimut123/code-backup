import java.io.*;
class sumation
{//declaration of class
    public static void main()throws IOException
    {//declaration of main
        int n,i,j,m,s=0;//inisialisation of variables
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter positive natural no.");//asking for number
        n=Integer.parseInt(br.readLine());//taking input
        if (n<1)
            {//checking if number positive or not
                System.out.println("Not a positive natural number");
                System.exit(1);
            }//end of loop
        for (i=1;i<=n/2;i++)
        {//loop to print the consecutine numbers
            for (j=i,s=0;j<=(n/2)+1;j++)
            {
                s=s+j;
                if (s==n)
                {//checking and printing result
                    for (m=i;m<=j;m++)
                    System.out.print(m+" ");
                    System.out.println();
                    break;
                }//end of if loop
            }
        }
    }//end of main
}//end of class