import java.io.*;
class arithstack
{
public static void main(String args[])throws IOException
{
int i,j,f=0,k=0,k1=0,n,p;
String stack1[]=new String[100];
String stack2[]=new String[100];
String s,s1="";
char ch;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter expression:");
s=input.readLine();

for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
p=(int)ch;
if((p>=65&&p<=90)||(p>=97&&p<=123)||(p>=48&&p<=57))
{
s1=s1+ch;
stack1[k]=s1;
s1="";
k++;
}
else
{
//System.out.println(ch);
s1=s1+ch;
stack2[k1]=s1;
s1="";
k1++;
}
}

k=0;
k1=0;
do
{
System.out.println("Press 1 to PUSH in alphabet stack:");
System.out.println("Press 2 to PUSH in operator stack:");
System.out.println("Press 3 to POP in alphabet stack:");
System.out.println("Press 4 to POP in operator stack:");
System.out.println("Press 5 to DISPLAY alphabet stack:");
System.out.println("Press 6 to DISPLAY in operator stack:");
System.out.println("Press 7 to EXIT:");
n=Integer.parseInt(input.readLine());
switch(n)
{
case 1:k++;
       break;
case 2:k1++;
       break;
case 3:k--;
       break;
case 4:k1--;
       break;
case 5:System.out.println("Alphabet stack:");
       for(i=k-1;i>=0;i--)
       {
       System.out.println(stack1[i]+" ");
       }
       break;
case 6:System.out.println("Operator stack:");
       for(i=k1-1;i>=0;i--)
       {
       System.out.println(stack2[i]+" ");
       }
       break;
case 7:System.exit(0);
default:System.out.println(" Press 1/2/3/4/5/6 only");
}
}while(true);
}
}      