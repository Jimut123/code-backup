import java . io . * ;
public class String_longestword
{
public static void main (String args[] )throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
String n,m="";
int i,l,k,p=0,maxl=0;
char ch,c;  
System.out.println ("Enter any  sentence:::");
n=(cd.readLine());
n = n+ " ";
l=n.length();
for(i=0;i<l;i++)
{
ch=n.charAt(i);
if((ch!=' ')||(ch!='.'))
{
m = m + ch;
}
else if((ch==' ')||(ch=='.'))
{
k=m.length();
if(k>=maxl)
{
maxl = k;
}
}
}
System.out.println ("longest word is=="+m);
m="";
System.out.println ("Max length of the longest word is::"+maxl);


}
}



