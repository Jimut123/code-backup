
public class notedno
{
    public static void main(int n)
    {
        int a[]={1000,500,100,50,20,10,5,2,1};
        int b[]={0,0,0,0,0,0,0,0,0};
        int i,n1,s;
        n1=n;
        s=0;
        System.out.println("         The given amount           "+n1);
        System.out.println("---------------------------------------");
        while(n>0)
        {
            for(i=0;i<9;i++)
            {
            if(a[i]<=n)
            {
                n=n-a[i];
                //System.out.println(n);
                b[i]=b[i]+1;
            }
        }
    }
    for(i=0;i<9;i++)
    {
        System.out.println("Note:"+a[i]+"*"+b[i]+"="+a[i]*b[i]);
        s=s+(a[i]*b[i]);
    }
    System.out.println("---------------------------------------");
    System.out.println("Total amount :"+s);
}
}