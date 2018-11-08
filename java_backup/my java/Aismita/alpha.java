class alpha
{ 
 public static void main(int n)
 {
     
     for(int i=1;i<=n;i++)
     {    int s=0;
         for(int m=1;m<=i;m++)
         s=s+m;
         if(i==n)
         System.out.print(s);
         else 
         System.out.print(s+" ");
        }
    }
}
 