package gr;

import java.io.*;
class sp
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int a[][],i,n,j,f,min,pos,pos1,max;
    sp()throws IOException
    {
        System.out.println("Enter term:");
        n=Integer.parseInt(br.readLine());
        a=new int[n][n];
        f=0;
    }
    void input()throws IOException
    {
        for(i=0;i<n;i++)
         for(j=0;j<n;j++)
          {
        System.out.println("Enter data:");
        a[i][j]=Integer.parseInt(br.readLine());
    }
}
void check()
{
     System.out.println("Matrix for Saddle check...");
        for(i=0;i<n;i++)
      {
         for(j=0;j<n;j++)
          {  
              System.out.print(a[i][j]+",");
            }
            System.out.println("");
        }
    while(f==0)
    {
     
      for(i=0;i<n;i++)
      {
         max=a[0][i];
          for(j=0;j<n;j++)
          {    
              if(a[j][i]>max)
              {
                  pos=j;
                  max=a[j][i];
                }
            }
            min=a[pos][i];
            for(j=0;j<n;j++)
            {
               if(a[pos][j]<min)
              {
                  pos1=j;
                  min=a[pos][j];
                }
            } 
            if(max==min)
            {
                f=1;
                break;
            }
        }
        if(f==0)
        {
            System.out.println("Saddle point not found..Going for rearrange of Matrix");
        remake();
    }
    }
    if(f==1)
    System.out.println("Saddle point found:"+pos+","+i);
    
}
void remake()
{
    int b[]=new int[n*n];
    int t=0,k,r,c;
    System.out.println("Matrix before remake");
        for(int i=0;i<n;i++)
      {
         for(int j=0;j<n;j++)
          {  
              System.out.print(a[i][j]+",");
            }
            System.out.println("");
        }
    for(i=0;i<n;i++)
    for(j=0;j<n;j++)
    {
        b[t++]=a[i][j];
    }
   for(i=0;i<t-1;i++) 
   for(j=i+1;j<t;j++)
    if(b[i]>b[j])
    {
        k=b[i];
        b[i]=b[j];
        b[j]=k;
    }
    r=c=0;
    for(int i=0;i<t;i++) 
    {
        a[r][c]=b[i];
        c++;
        if(c>=n)
        {
            c=0;
            r++;
        }
    }
    System.out.println("Matrix after remake");
        for(int i=0;i<n;i++)
      {
         for(int j=0;j<n;j++)
          {  
              System.out.print(a[i][j]+",");
            }
            System.out.println("");
        }
    
}
}