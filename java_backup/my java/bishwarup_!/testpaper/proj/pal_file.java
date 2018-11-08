package testpaper.proj;

import java.io.*;
class pal_file
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("palfile.txt")));
System.out.println("give the word :");
String w=br.readLine();
int i,j,f=0;
for(i=0,j=w.length()-1;i<w.length()/2;i++,j--)
if(w.charAt(i)!=w.charAt(j))
{
f=1;
break;
}
if(f==0)
pw.println(w);
pw.close();
BufferedReader ob=new BufferedReader(new FileReader("palfile.txt"));
String s="";
System.out.println("Output of File :");
while((s=ob.readLine())!=null)
System.out.println(s);
ob.close();
}
}
