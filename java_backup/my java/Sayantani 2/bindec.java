class bindec
{
    public static void main(int n)
    {
       
        String s="";
        int i;
        while(n>0)
        {
            int k=n%2;
            if(k==1)
            s=s+"1";
            else 
            s=s+"0";
            n=n/2;
            
        }
        for(i=s.length()-1;i>=0;i--)
        System.out.print(s.charAt(i));
        }
    }