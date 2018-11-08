import java.io.*;
class vowel_count
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,k,l,v=0;
String s;
char ch;
System.out.println("ENTER A STRING:");
s=br.readLine();
l=s.length();
System.out.println("1.TO PRINT THE NUMBER OF VOWELS IN THE STRING");
for(i=0;i<l;i++)
{
ch=(s.charAt(i));
if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')||(ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
v=v+1;
}
System.out.println("THE NUMBER OF VOWELS IN THE STRING ARE:"+v);
}
}