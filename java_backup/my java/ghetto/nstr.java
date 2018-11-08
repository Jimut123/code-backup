import java.io.*;
public class nstr
{
public static void main(String[]args)throws IOException
{
DataInputStream in=new DataInputStream(System.in);
int d,c,a;

System.out.println("Enter the number of entries ");
a=Integer.parseInt(in.readLine());
String b[]=new String[a];
for(c=0;c<a;c=c+1)
{
System.out.println("ENTER THE STRING");
b[c]=in.readLine();
}
for(d=0;d<a;d=d+1)
{
if(b[d].charAt(b[d].length()-1)=='a'|| b[d].charAt(b[d].length()-1)=='e'|| b[d].charAt(b[d].length()-1)=='i'||
b[d].charAt(b[d].length()-1)=='o'|| b[d].charAt(b[d].length()-1)=='u'|| b[d].charAt(b[d].length()-1)=='A'||
b[d].charAt(b[d].length()-1)=='E'|| b[d].charAt(b[d].length()-1)=='I'|| b[d].charAt(b[d].length()-1)=='O'|| 
b[d].charAt(b[d].length()-1)=='U')
{
System.out.println(b[d]);
}}}}