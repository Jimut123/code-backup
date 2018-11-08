class Armff
{
int n;
public  static void arm(int n)
{
 int c=0;
 for(int i=n;i>0;i=i/10)
 {
     int s=i%10;
     c=c+(s*s*s);
     if(c==n)
     {
         System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not an Armstrong");
        }
    }
}
public void main()
{
Armff obj=new Armff();
obj.arm(n);
}
}