import java.util.*;
class reesavmatrixdiagonal
{
public static void main(int n)
{
Scanner sc=new Scanner(System.in);
int s[][]=new int [n][n];
int i=0,j=0,hm=0,lm=0;
  for(i=0;i<n;i++)
  {
      for(j=0;j<n;j++)
      {
          if(i==j)
          {
              s[i][j]=1;
            }
        }
    }
   for(i=n-1;i>=0;i--)
   {
       for(j=n-1;j>=0;j--)
       {
          if(i+j==n-1)
          {
              s[i][j]=1;
            }
        }
    }
    lm=1;
    hm=n-1;
    int k=n/2;
    j=0;
    while(k>0)
    {
   for(i=lm;i<hm;i++)
    {
      s[i][j]=2;
        
    }
    lm++;
    hm--;
    k--;
    j++;
    
}
lm=1;
    hm=n-1;
     k=n/2;
    j=n-1;
    while(k>0)
    {
   for(i=lm;i<hm;i++)
    {
      s[i][j]=4;
        
    }
    lm++;
    hm--;
    k--;
    j--;
    
}
lm=1;
    hm=n-1;
     k=n/2;
    i=n-1;
    while(k>0)
    {
   for(j=lm;j<hm;j++)
    {
      s[i][j]=3;
        
    }
    lm++;
    hm--;
    k--;
    i--;
    
}
lm=1;
    hm=n-1;
     k=n/2;
    i=0;
    while(k>0)
    {
   for(j=lm;j<hm;j++)
    {
      s[i][j]=5;
        
    }
    lm++;
    hm--;
    k--;
    i++;
    
}


    
    
    for(i=0;i<n;i++)
   {
       for(j=0;j<n;j++)
         {
             System.out.print(s[i][j]+" ");
             
            }
            System.out.println();
        }
    }
}

           