import java.io.*;
class series
{//declaration of class
    public static void main()throws IOException
    {//declaration of main
        double s=1,p,i,j,n,m,x;//inisialisation of variables
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter value of 'x'");
        x=Double.parseDouble(br.readLine());//taking input
        System.out.println("Enter limit");
        n=Double.parseDouble(br.readLine());//taking input
        for (i=1,m=1;i<=n;i++,m=m+2)
        {//to find sum of series
            for (j=1,p=1;j<=i;j++)
            p=p*j;
            s+=Math.pow(x,m)/p;
        }//end of loop      
        System.out.println("Sum is "+s);
    }//end of main
}//end of class
