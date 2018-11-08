import java.io.*;
class triangle
{
void decide(int x,int y,int z)
{
if((x==y)&&(y==z))
System.out.println("It is Equilateral Triangle.");
else if((x==y)||(y==z)||(z==x))
{
System.out.println("It is Isoscales Triangle.");
}
else if((x!=y)&&(y!=z)&&(z!=x))
{
System.out.println("It is Scalene Triangle.");
}
}
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
triangle ob=new triangle();
int a,b,c;
System.out.println("Enter three sides:");
a=Integer.parseInt(cd.readLine());
b=Integer.parseInt(cd.readLine());
c=Integer.parseInt(cd.readLine());
ob.decide(a,b,c);
}
}