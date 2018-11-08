import java.io.*;
class computer
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int x,i,a=0;
String s;
char ch;
System.out.println("give a string");
s=br.readLine();
x=s.length();
for(i=0;i<x;i++)
{
ch=s.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
a++;

}
 System.out.println("countofvowels"+a );
}
}
