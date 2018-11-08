//ISC_2010_Question 2 on kaprikar series
import java.io.*;
class kaprikar_no
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int p,q,n1,n2,k,l,v1,v2,n3,n,i,s=0;
        System.out.println("\f");
        
            n=297;
            n1=n*n;
            n2=n1;
            n3=n1;
            while(n2!=0)
            {
                s++;
                n2=n2/10;
            }
           System.out.println(" s = "+s);
           System.out.println("n2 = "+n2);
            l=s/2;
           System.out.println("l = "+l);
            k=s-l;
            System.out.println("k = "+k);
            v1=n3%((int)(Math.pow(10,k)));
            System.out.println("v1 = "+v1);
            v2=n3/((int)(Math.pow(10,l+1)));
            System.out.println("v2 = "+v2);
            if((v1+v2)==n)
            {
              System.out.println(n+" ");
            }
            else
            {
                System.out.println("Invalid...");
            }
        }
    }