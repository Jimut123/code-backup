import java.io.*;
class string_compare
{
public static void main(String args[])throws IOException
{
String s,s1,w;
int i;
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
char ch;
System.out.println("Give String:");
s=br.readLine();
w=s1="";
ch=' ';
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
if(ch==' ')
{
//System.out.println(w);
if(w.compareTo("26")==0)
s1=s1+"15";
else
if(w.compareTo("JANUARY")==0)
s1=s1+" "+"AUGUST";
else
if(w.compareTo("REPUBLIC")==0)
s1=s1+" "+"INDEPENDENCE";
else
s1=s1+" "+w;
w="";
}
else
w=w+ch;
}
if(w.compareTo("26")==0)
s1=s1+"15";
else
if(w.compareTo("JANUARY")==0)
s1=s1+"AGUST";
else
if(w.compareTo("REPUBLIC")==0)
s1=s1+"INDEPENDENCE";
else
s1=s1+" "+w;
System.out.print(s1);
}
}
