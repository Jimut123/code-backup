 

//Print tne Fibonaki serease into "N". i.e. 1,2,3,5,8,13,_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _,N.\\
class fibonaccie
{
  public static void main(int n)
  {
      int a,b,c,i;
      a = 1;
      b = 2;
      System.out.print(a+","+b+",");
      for(i=1;i<=n-2;i++)
      {
          c = a+b;
          System.out.print(c+",");
          a = b;
          b = c;
        }
    }
}