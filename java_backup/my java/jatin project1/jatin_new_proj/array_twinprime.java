package jatin_new_proj;
import java.io.*;
class array_twinprime 
{
    public  void input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int[20];
        int i,j,f,f1;
        System.out.print("enter20 elements");
         for(i=0;i<20;i++)
         a[i]=Integer.parseInt(br.readLine());
        for(i=0;i<20;i++)
        {
            f=p_check(a[i]);
            if(f==0)
            {
              for(j=i+1;j<20;j++)
        {  
            f1=p_check(a[j]);
            if(f1==0)
            {
                if((a[i]-a[j]==2) || (a[i]-a[j]==-2))
                 System.out.println(a[i]+","+a[j]);
                }
            }
        }
    }
}
int p_check(int i)
{
    int kk,ff;
    ff=0;
    for(kk=2;kk<i;kk++)
    if(i%kk==0)
    {
        ff=1;
        break;
    }
    if(ff==0)
    return 0;
    else
    return 1;
}
}