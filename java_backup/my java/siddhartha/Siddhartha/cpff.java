

 class cpff
{
int n;
   public void cp(int n)
   {int c = 0;
       for(int i=1;i<=n;i++)
       {
           if(n%i==0)
           {
               c++;
            }
            if(c==2)
            {
                int s=0;
                for( int d=n;d>0;d=d/10)
                {
                    int a=d%10;
                s=(s*10)+d;
                int f=0;
                for(int j=1;j<=s;j++) 
                if(s%j==0)
                { 
                    f++;
                }
                if(f==2)
                {
                    System.out.println("Circular Prime");
                }
                else
                {
                    System.out.println("Not a Circular Prime");
                }
            }
        } 
    }
}
public void main()
{
   cpff obj=new cpff();
   obj.cp(n);
}
}
           