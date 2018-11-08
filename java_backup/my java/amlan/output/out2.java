package output;

class out2
{
   public static void main(String agrs[])
   {
       int k=5;
       int s;
       s=++k%--k/++k;
       System.out.println(s);
       k=5;
       s=++k%--k;
       System.out.println(s+","+k);
       k=5;
       s=--k%++k;
       System.out.println(s+","+k);
    }
}
