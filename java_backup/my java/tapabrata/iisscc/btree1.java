package iisscc;


import java.io.*;
class btree1
{
btree b=new btree();
btree b1=new btree();
int x;
String y;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void calc()throws IOException
{
btree b1=new btree();
y="YES";
b=null;
while(y.compareTo("YES")==0||y.compareTo("Yes")==0||y.compareTo("yes")==0)
{
System.out.println("Give a Value");
x=Integer.parseInt(br.readLine());
b=create(b,x);
System.out.println("Want another:");
y=br.readLine();
}
b1=b;
System.out.println("Preeorder");
preorder(b1);
System.out.println("Inorder");
inorder(b1);
System.out.println("Postorder");
postorder(b1);
}
btree create(btree b,int x)throws IOException
{
//b1=b;
if(b==null)
{
b=new btree();
b.input(x);
b.leftchild=null;
b.rightchild=null;
//return b;
}
else
{
//System.out.println("Give a Value");
//x=Integer.parseInt(br.readLine());
if(x<=b.x)
{
//b1=b;
//System.out.println(b.x);
//b.leftchild=new btree();
//b1.x=0;
b.leftchild=create(b.leftchild,x);
}
else
if(x>b.x)
{
//b1=b;
//System.out.println(b1.x);
//b.rightchild=new btree();
//b.x=0;
b.rightchild=create(b.rightchild,x);
}
}
return b;
}
void preorder(btree b1)
{
if(b1!=null)
{
b1.disp();
preorder(b1.leftchild);
preorder(b1.rightchild);
}
}
void inorder(btree b1)
{
if(b1!=null)
{
preorder(b1.leftchild);
b1.disp();
preorder(b1.rightchild);
}
}
void postorder(btree b1)
{
if(b1!=null)
{
preorder(b1.leftchild);
preorder(b1.rightchild);
b1.disp();
}
}
}
