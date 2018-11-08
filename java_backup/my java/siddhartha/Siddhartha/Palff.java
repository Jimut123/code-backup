package Siddhartha;

class Palff
{
 int n;
 public static void pal(int n)
   {
       int c=0;
     for(int i=n;i>0;i=i/10)
     {
         int s=i%10;
          c=(c*10)+s;
         if(c==n)
         {
             System.out.println("Palindrome");
            }
            else
            {
                System.out.println("Not a Palindrome");
            }
        }
    }
        public void main()
        {
            Palff obj=new Palff();
            obj.pal(n);
        }
    }