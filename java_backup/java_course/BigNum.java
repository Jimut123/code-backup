public class BigNum
{
    int lsp,msp;
    BigNum(String bn)
    {
        int k,n,i;
        String l="",m="";
        n=bn.length();
        if(n>8)
        {
            l=bn.substring(n-8,n);
            m=bn.substring(0,n-8);
        }
        k=l.length();
        for(i=0;i<k;i++)
        lsp=lsp*10+(int)l.charAt(i)-48;
        k=m.length();
        for(i=0;i<k;i++)
        msp=msp*10+(int)m.charAt(i)-48;
    }
    BigNum Add(BigNum y)
    {
        BigNum Result = new BigNum("");
        Result.lsp=lsp+y.lsp;
        int carry=0;
        if(Result.lsp>100000000)
        {
            Result.lsp-=100000000;
            carry=1;
        }
        Result.msp=carry+msp+y.msp;
        return Result;
    }
}