import java.io.*;
public class KrishnamurthyNum
 {public static void main()throws IOException
     {BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter the number");
         int a=Integer.parseInt(br.readLine());
         int r ,s=0,k=a;
          while(a>0)
           {r= a%10;
             s+= fact(r);
             a=a/10;
            }
            if(s==k)
            System.out.println(" IT is not a Krishnamurthy number");
            else
            System.out.println(" It is  a Krishnamurthy number");
        }
        public static int fact(int a)
         { int fact=1;
             for(int i=1;i<=a;i++)
              {
                  fact*=i;
                }
                return fact;
            }
        }