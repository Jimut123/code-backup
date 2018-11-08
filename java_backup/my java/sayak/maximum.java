
public class maximum
{
  public static void main(int a,int b,int c)
  {
      int max=a;
      if (b>max)
      {
          max=b;
        }
        if (c>max)
        {
            max=c;
        }
        System.out.println("Maxmost integer="+max);
        int sq=max*max;
        int cb=max*max*max;
        System.out.println("Square="+sq);
        System.out.println("Cube="+cb);
    }
}