import java.io.*;
class seri
{
    int n,i,s,f,k,j;
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   
        void input()throws IOException
        {
        n=Integer.parseInt(br.readLine());
        gen();
    }
    void gen()
        {
            s=0;
    f=1;
    k=1;
    j=1;
            for(i=1;i<=n;i=i+1)
        {
        s=s+(power(j)/fact(j))*k;
        k=k*-1;
        j=j+2;
    }
    System.out.println(s);
}
int power(int x)
{
    int i,f;
    f=1;
    for(i=1;i<=x;i++)
    f=f*x;
    return f;
}
int fact(int x)
{
    int i,f;
    f=1;
    for(i=1;i<=x;i++)
    f=f*i;
    return f;
    }
}
        