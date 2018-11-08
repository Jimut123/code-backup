import java.io.*;
class pat
{
   public static void main(String args[])throws IOException
{
       InputStreamReader ab=new InputStreamReader(System.in);
       BufferedReader cd=new BufferedReader(ab);
        int i,j,s=1,c=1;
        System.out.println("\f");
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                c = (int)Math.pow(s,2);
                System.out.print(c+" ");
                s=s+2;
            }
            System.out.println();
            s=1;
        }
        s = 1;c=1;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=4;j++)
            {
                System.out.print(s);
                s=s+2;
             }
             s=0;
             c++;
            s=s+c;
            System.out.println();
        }
        c=16;
         for(i=5;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                c--;
                System.out.print(c+" ");
            }
            System.out.println();
        }
        s=1;c=1;
         for(i=5;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        s=10;
          for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                s=(j*10)+i;
                System.out.print(s+" ");
            }
            System.out.println();
        }
        System.out.println("Enter a word:");
        String n = cd.readLine();
        int k,l = n.length();
        for(i=0;i<=l-1;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(n.charAt(i));
            }
            System.out.println();
        }
         for(i=l-1;i>=0;i--)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(n.charAt(j));
            }
            System.out.println();
        }
        int   m=-1;
         for(i=l-1;i>=0;i--,m++)
        {
            for(k=0;k<=m;k++)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print(n.charAt(j));
            }
            System.out.println();
        }
    }
}







                