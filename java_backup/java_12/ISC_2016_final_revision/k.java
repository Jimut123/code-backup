//ISC_2010_Question 2 on kaprikar series
import java.io.*;
class k
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int p,q,n1,n2,k,l,v1,v2,n3,n,i,s=0,f=0;
        System.out.println("Enter the range : ");
        p=Integer.parseInt(cd.readLine());
        q=Integer.parseInt(cd.readLine());
        if((p<5000)&&(q<5000))
        {
            for(i=p;i<=q;i++)
            {
            n=i;
            n1=n*n;
            n2=n1;
            n3=n1;
            while(n2!=0)
            {
                s++;
                n2=n2/10;
            }
           
            l=s/2;
            k=s-l;
            if(s%2==0)
            {
              v1=n3%((int)(Math.pow(10,k)));
              v2=n3/((int)(Math.pow(10,l)));
            }
            else
            {
              v1=n3%((int)(Math.pow(10,k)));
              v2=n3/((int)(Math.pow(10,l+1)));
            }
        
            if((v1+v2)==n)
            {
              System.out.print(n+" ");
              f++;
            }
             s=0;
          }
           System.out.print("Frequency of kaprikar number : "+f);
        }
       else
       {
           System.out.print("Invalid Input.");
        }
    }
}
