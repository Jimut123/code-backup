import java.io.*;
class sm
{
int a,b,c;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
public sm()throws IOException
{
System.out.println("Enter numbers:");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
}
public void add()
{
c=a+b;
System.out.println(c);
}
}
class sum1
{
 public static void main(String args[])throws IOException
 {
   sm s= new sm();
   
}
}
