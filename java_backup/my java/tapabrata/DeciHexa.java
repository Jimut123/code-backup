import java.io.*;
class DeciHexa
{
  public static void main(String args[])throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int i=0,c=0,n,r;
      int ar[]=new int[20];
      System.out.println(" Enter a decimal number ");
      n=Integer.parseInt(br.readLine());
      System.out.println(" The hexadecimal equivalent of decimal number " +n);
      while(n>0)
      {
          r=n%16;
          ar[i]=r;
          n=n/16;
          i++;
          c++;
        }
        for(i=c-1;i>=0;i--)
        {
            if((ar[i]>=10)&&(ar[i]<=15))
            {
                if(ar[i]==10)
                System.out.print("A");
                if(ar[i]==11)
                System.out.print("B");
                if(ar[i]==12)
                System.out.print("C");
                if(ar[i]==13)
                System.out.print(" D");
                if(ar[i]==14)
                System.out.print("E");
                if(ar[i]==15)
                System.out.print("F");
            }
            else
            {
                System.out.print(ar[i]);
            }
            System.out.println();
        }
    }
}