import java.io.*;
class Function
{
      BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
  int n;
  int a[];
  public void input()throws IOException
  {
      System.out.println("Give limit:");
       n=Integer.parseInt(b.readLine());
      a=new int[n];
      for(int i=0;i<n;i++)
      {
        System.out.println("Enter values:");  
           a[i]=Integer.parseInt(b.readLine());
          
        }
    }
    public void calculate()throws IOException
    {
        int t= 0;int pos=0,j,i;
        for( i=0;i<n-1;i++)
        {
            pos =i;
            for( j=i+1;j<n;j++)
            {
                if(a[j]<a[pos])
            { 
               pos=j;
            }
        }
         t=a[i];
                a[i]=a[pos];
                a[pos]=t;
    }
}

public void display()throws IOException
{
for(int i=0;i<n;i++)
{
 System.out.println(a[i]);
}
}
}
               
           
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
               
                