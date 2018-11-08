package jatin_new_proj;
import java.io.*;
class arr1 
{
    public  void input(String args[])throws IOException
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("enter limit");
         int n=Integer.parseInt(br.readLine());
         int a[]=new int[n];
         int b[]=new int[n];
         int c[]=new int[n+n];
         int i,j,t,p,u;
         System.out.println("enter elements");
          for(i=0;i<n;i++)
             a[i]=Integer.parseInt(br.readLine());
         System.out.println("enter elements");
          for(i=0;i<n;i++)
             b[i]=Integer.parseInt(br.readLine());    
             
           t=0;
           i=j=0;
           while(i<n )
           {
               if(p_check(a[i])==0)
               {
                   c[t++]=a[i];
                  
                }
                i++;
            }
            while(j<n )
           {
               if(p_check(b[j])==0)
               {
                   c[t++]=b[j];
                  
                }
                j++;
            }
                     
                
            
            i=j=0;
            p=t;
            while(i<n )
           {
               if(p_check(a[i])==1)
               {
                   c[t++]=a[i];
                   
                }
              i++; 
            }
             while(j<n )
           {
               if(p_check(b[j])==1)
               {
                   c[t++]=b[j];
                   
                }
              j++; 
            }
            System.out.println("3 rd array befeore sorting");
            for(i=0;i<t;i++)   
            System.out.println(c[i]);
            //t=t-1;
            System.out.println("3 rd array after sorting");
            for(i=p;i<=t-1;i++)
            {
             for(j=i+1;j<t;j++)
             {
             if(c[i]>c[j])
             {
                 u=c[i];
                 c[i]=c[j];
                 c[j]=u;
                }
            }
        }
            for(i=0;i<t;i++)   
            System.out.println(c[i]);
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
            
                  
                  