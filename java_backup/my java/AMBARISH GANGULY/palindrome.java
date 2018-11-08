class palindrome
{
    public static void main (int n)
    {
        int i;int j;int k;int p;int s;int n1;
        p=n;s=0;n1=0;
        i=n;
        while(n>0)
        { 
            k=n%10;
            s=(s*10)+k;
            n=n/10;
        }
        //System.out.println(s);
            if(p==s)
            System.out.println("palindrome is"+s);
            else
            System.out.println("Non palindrome ");
        
    }   }