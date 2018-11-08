import java.io.*;
class sqroot
{
    public static void main(String arg[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of elements");
        double n=Integer.parseInt(br.readLine());
        double min=999999,p,i,d,d1,c=0,min1=99999,st1=0,st2=0;
        double k,st=0;
        for(i=1;i<n/2;i++)
        {
            d=n-(i*i);
            if(d<0)
            d=d*(-1);
            if(d<min)
            {
               p=i*i;
               st=i;
                min=d;
            }
        }
        System.out.println(+st);
        st2=st;
        double x=0;
       // while(c!=1)
        //{
           // c++;
            for(i=1;i<=9;i++)
            {
                d1=n-(st2*st2);
                if(d1<0)
                d1=d1*(-1);
                   st2=st2-(x*0.1);
                if(d1<min1)
                {
                    x=i;
                    min1=d1;
                    //k=0.1*i;
                    //st1=st1+k;
                    //st2=st+st1;
                }
                st2=st2+(x*0.1);
            }
        
        double y=st+(0.1*x);
        System.out.println(+y);
        System.out.println(+st2);
    }
}
                    