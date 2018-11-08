import java.io.*;
class ab
{
int a;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
System.out.println("Give value:");
a=Integer.parseInt(input.readLine());
}
void disp()
{
System.out.println(a);
}
}

