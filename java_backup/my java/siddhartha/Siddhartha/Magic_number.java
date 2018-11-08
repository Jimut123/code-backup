class Magic_number
{
public static void main(int n)
{
 int s,d,m=0,i;
 for(i=10;i<=n;i++)
 {   s=0;
     d=0;
     m=i;
     while(m>0)
     {
         d=m%10;
         s=s+d;
         m=m/10;
        }
        if((s==1)||(s==10))
        System.out.println("The magic numbers are" +i);
     
    }
}
}

