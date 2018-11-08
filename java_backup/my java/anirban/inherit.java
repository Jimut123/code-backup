import java.io.*;
class inherit
{
int a,b,c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void Input()throws IOException
{
System.out.println("Give both the values");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
c=a+b;
}
void display()
{
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
}
class inherit1 extends inherit
{
int e,f,g;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void Input()throws IOException
{
System.out.println("Give both the values ");
e=Integer.parseInt(br.readLine());
f=-Integer.parseInt(br.readLine());
g=e+f;
super.Input();
}
void Show()
{
super.display();
System.out.println(e);
System.out.println(f);
}
}
