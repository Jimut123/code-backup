package testpaper.proj;

import java.io.*;
class bsnl_telephone
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("phone.dat")));
String n="",add="",ch="";
long no=0;
do
{
System.out.println("give the name :");
n=br.readLine();
pw.println(n);
System.out.println("give the address :");
add=br.readLine();
pw.println(add);
System.out.println("give the telephone number :");
no=Long.parseLong(br.readLine());
pw.println(no);
System.out.println("want to give more entries ? (y/n) :");
ch=br.readLine();
}while(ch.equalsIgnoreCase("y")==true);
pw.close();
br=new BufferedReader(new FileReader("phone.dat"));
n=add="";
no=0;
char c;
System.out.println("Calcutta Telephone Directory :::\nrecords with vowel starting names : ");
while((n=br.readLine())!=null)
{
c=n.charAt(0);
if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
{
System.out.println(n);
add=br.readLine();
System.out.println(add);
no=Long.parseLong(br.readLine());
System.out.println(no);
}
}
br.close();
}
}
