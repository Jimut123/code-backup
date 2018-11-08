import java.io.*;
public class ts
{
    int a[],b;
    void input()throws IOException
    {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int c=0;String ch="";
        System.out.println("Enter the limit");
        b=Integer.parseInt(sc.readLine());
        a=new int[b];
        while(ch!="N")
        {
           // System.out.println("Do you want to enter data");
            //ch=sc.readLine(); 
            if(/*ch=="N" ||*/ c==b)
            {
                break;
            }
            System.out.println("Enter Data");
            a[c]=Integer.parseInt(sc.readLine());
            c++;
            if(ch=="N" || c==b)
            {
                break;
            }
        }
        cal();
    }
    void cal()throws IOException
    {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int c,m,n,num,fl=0;
        System.out.println("Enter number");
        num=Integer.parseInt(sc.readLine());
        int st[]=new int[b];
        m=b-1;
        int l=0;
        n=0;
        for(c=0;c<b;c++)
        {
            
        if(a[c]!=num)
        {
            st[n]=a[c];
            n++;
        }
        else 
        {
            fl=1;
        }
        }
        if(fl==0)
        {
            System.out.println("car is not present");
        }
        else
        {
            System.out.println("Car is present");
        }
        
        c=0;
        
        System.out.println("The list of cars :");
        for(c=0;c<n;c++)
        {
            System.out.println(+st[c]);
        }
    }
}