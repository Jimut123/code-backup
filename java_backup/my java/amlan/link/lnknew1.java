package link;

import java.io.*;
class lnknew1
{
int x;
String y;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
lnknew1 l;
lnknew1 obj;
void input()throws IOException
{
y="YES";
obj=this;
while(y.equalsIgnoreCase("YES")==true)
{
System.out.println("Give no:");
x=Integer.parseInt(br.readLine());
System.out.println("Give another:");
y=br.readLine();
if(y.equalsIgnoreCase("YES")==true)
{
l=new lnknew1();
l=l.l;
}
}
this.l=null;
//this=obj;
disp();
}
void disp()
{
obj=this;
while(obj!=null)
{
System.out.println(obj.x);
obj=obj.l;
}
}

}
