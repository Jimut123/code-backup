public class renote
{
    public static void main(int n)
    {
        int a[]={1000,500,100,50,20,10,5,2,1};
        int alen=8;
        int c=0;
        int rem=0;
        do{
            if(c!=alen)
            {
                if(((n%a[c])/a[c+1])>1)
                {
                int k=n/a[c];
                System.out.println("Note             "+a[c]+"     are          "+k);
                 
                 n=n-(k*a[c]);
                 System.out.println(n);
                 
                }
                else if(n/a[c]>2)
                {
                int k=n/a[c]-1;
                System.out.println("Note             "+a[c]+"         is                     "+k);
                n=n-(k*a[c]);
                  System.out.println(n);
                
                }
                if(c==alen)
                System.out.println("Note           "+a[c]+"            is                      "+rem);
                c++;
            }
        }while(n>0);
    }
}