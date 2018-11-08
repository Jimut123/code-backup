import java.io.*;
class string_swap
{
public static void main(String args[])throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Give term:");
String s=br.readLine();
String w="";
int i,j;
for( i=s.length()-1;i>=0;i--)
{
if(s.charAt(i)==' ')
{
for(j=w.length()-1;j>=0;j--)
System.out.print(w.charAt(j));
System.out.print(" ");
w="";
}
else
w=w+s.charAt(i);
}
for(j=w.length()-1;j>=0;j--)
System.out.print(w.charAt(j));
}
}