class check
{
public static void main(int a, int b, int c)
  {
      if(a==b&&b==c&&c==a)
         System.out.print("equilateral");
      else
         if(a==b||b==c||c==a)
          System.out.print("isosceles");
          else
     
          System.out.print("scalene");
        }
    }  