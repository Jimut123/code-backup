class inHeritance extends b
{
     public static void main(String args[])
    {
      inHeritance ob = new inHeritance();
      System.out.println(ob.a1);
      System.out.println(ob.b1);
    }     
}
class a
{
   int a;
   public void seta(int x)
   {
       a=x;
   }
   public int geta()
   {
       return a;
   }
   public int setyuo;
}
class b  
{
     public int a1=20;
     public int b1=10;
}