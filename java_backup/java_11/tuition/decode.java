class decode
{
    public static void main(String s)
    {
        int n,i=0,j,k;
        long p;
        String t="",m="";
        while(i<s.length())
        
        {
            for(j=i;j<(i+3);j++)
            {
                t=t+s.charAt(i);
            }
            p=Long.valueOf(t);
            if(p>122)
            {
                p=p/10;
                i=i+2;
            }
            else
            i=i+3;
            m=m+(char)p;
        }
        System.out.print(m);
    }
}