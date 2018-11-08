package link;

import java.io.*;
class lnknew
{
int x;
String y;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
lnknew l;
lnknew obj,obj1;
void input()throws IOException
{
obj=new lnknew();
obj1=new lnknew();
obj1=obj;
y="YES";
while(y.equalsIgnoreCase("YES")==true)
{
System.out.println("Give no:");
obj1.x=Integer.parseInt(br.readLine());
System.out.println("Give another:");
y=br.readLine();
if(y.equalsIgnoreCase("YES")==true)
{
obj1.l=new lnknew();
obj1=obj1.l;
}
}
obj1.l=null;
disp();
}
void disp()
{
obj1=obj;
while(obj1!=null)
{
System.out.println(obj1.x);
obj1=obj1.l;
}
}

}
