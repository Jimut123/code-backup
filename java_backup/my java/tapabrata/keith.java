import java.io.*; 
class keith
{
 int n,p=0,i=0,k,j,r,c=0,arr[],n1,f=0;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 public void calculate()throws IOException
 {
     System.out.println("Enter number");
     n=Integer.parseInt(br.readLine());
     arr=new int[100];
     int m=n;
     n1=0;
     while(m>0)
         {
            
             r=m%10;
             n1=(n1*10)+r;
             m=m/10;
              
         }
     
              while(n1>0)
         {
            
             r=n1%10;
             arr[c]=r;
             n1=n1/10;
              c++;
         }
     //System.out.println(c);
     while(p<n)
     {
         arr[c]=p;
         j=i;
         p=0;
         while(j<c)
         {
             p=p+arr[j];
             j++;
         }
         if(p>n)
         {
             f=1;
             break;
         }
         //System.out.println(p);
         arr[c]=p;
         c++;
         i++;
         //p=0;
     }
 if(f==0)
 System.out.println("Keith no:"+n);
 else
 System.out.println("Non Keith no:"+n);
    }
 public void main()throws IOException
    {
        calculate();
    }
}
        
     