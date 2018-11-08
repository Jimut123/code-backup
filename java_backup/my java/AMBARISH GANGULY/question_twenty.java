class question_twenty
 {
   public static void main(int n)
    {
       int k,s=0,m=0,n1=n;
       while(n>0)
       {
        k=n%10;
        s=(s*10)+k;
        n=n/10;
                        
                    }
                  m=s+n1;
                     System.out.print("result is"+m);
                    }
                }
