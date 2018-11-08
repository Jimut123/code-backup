import java.io.*;
class convrt
{
public static void main(String args[])throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
String s;
String w1="";
String w2="";
String w3="";
int i,j;
System.out.println("Enter the string");
s=input.readLine();
for(i=0;i<s.length();i++)
{
w1=w1+s.charAt(i);
if(w1.compareTo("the")==0||w1.compareTo("The")==0||w1.compareTo("THE")==0)
{
w1="then";
w2=w2+w1;
w1="";
}
else
{
if(s.charAt(i)==' ')
{
int c=0;
for(j=0;j<w1.length();j++)
{
if(w1.charAt(j)=='T'||w1.charAt(j)=='t')
{
while(c<3)
{
w3=w3+w1.charAt(j);
j++;
c++;
}
j--;
c=0;
}
else
w2=w2+w1.charAt(j);
if(w3.compareTo("The")==0||w3.compareTo("the")==0||w3.compareTo("THE")==0)
{
w2=w2+"then";
System.out.println(w2);
w3="";
}
else
{
w2=w2+w3;
w3="";
}
}
w1="";
}
}
}
System.out.println("ww"+w1);
//for last word
int c=0;
for(j=0;j<w1.length();j++)
{
if(w1.charAt(j)=='T'||w1.charAt(j)=='t')
{
while(c<3)
{
w3=w3+w1.charAt(j);
j++;
c++;
}
j--;
c=0;
}
else
w2=w2+w1.charAt(j);
System.out.println(w3);
if(w3.compareTo("The")==0||w3.compareTo("the")==0||w3.compareTo("THE")==0)
{
System.out.println(w2);
w2=w2+"then";
System.out.println(w2);
w3="";
}
else
{
w2=w2+w3;
w3="";
}
}
w1="";

//w2=w2+w1;
s=w2;
System.out.println("The string is" +s);
}
}

        
