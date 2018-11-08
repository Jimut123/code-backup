

public class result
{
   public static void main()
   {
      String n="Chinmoy";
       int h=73,s=90,e=82;
       int tm=h+s+e;
       int p=tm/4;
       System.out.println("Name="+n);
       System.out.println("Total Marks="+tm);
       System.out.println("Percentage="+p);
       if(p>=40)
       {
           System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }
    }
}
