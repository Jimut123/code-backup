
public class denomarray
 {
     public static void main(int amt)
      {
          int a[]={1000,500,100,50,20,10,5,2,1};
          int i,k,n;
          n=a.length;
          for(i=0;i<n;i++)
          {
              k=amt/a[i];
              amt=amt%a[i];
              if(k>0)
               System.out.println("Rs."+a[i]+"notes:"+k);
            }
        }
    }
              
          