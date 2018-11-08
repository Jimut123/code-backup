
class test 
{ 
public static void main(int n)
{int i,b,c,a;
    a=0;
    b=1;
   System.out.print(a+","); System.out.print(b+",");
   for (i=1;i<=n-2;i++)
 {
     c=a+b;
     System.out.print(c+",");
     a=b;
     b=c;
    }
}
}
    
   

     