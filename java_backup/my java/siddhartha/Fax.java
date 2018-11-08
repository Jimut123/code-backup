import java.io.*;
class Fax
{
 public static void main()throws IOException
 {  long b=0;
     BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter fax:");
     long a=Long.parseLong(br.readLine());
    long c=a%10000;
    a=a/10000;
    long d=a%10000;
    //ong e=a/10000;
    a=a/10000;
     long h=a%100;
    long f=a/100;
   
    System.out.println("Country code="+f);
    System.out.println("City code="+h);
    System.out.println("Exchange code="+d);
    System.out.println("Number="+c);
}
}