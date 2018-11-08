import java.io.*;
class conseq
{
    public static void main()throws IOException
    {
        int k,c=0,a=0,p=1,s=0,f,i,j;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter value of k:");
        for(i=1;;i++)
        {
        k=Integer.parseInt(br.readLine());
        if(k==0)
        {
        break;
    }
    f=0;
    for(j=2;j<k;j++)
    
    if(k%j==0)
    {
        f=1;
        break;
    }
    if(f==0)
    {
        c++;
        s=s+k;
    }
    int s1=0;
    for(i=1;i<k;i++)
    if(k%i==0)
    s1=s1+i;
    if(s1==k)
    p=p*k;
    }
    System.out.print("Average:"+(s/c));
    System.out.print("Perfect:"+p);
}
}
    
        