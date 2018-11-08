import java.io.*;
class Concatenated_Palindrome
{
public static void main (String args [])throws IOException
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader x = new BufferedReader(read);
String str,str1,str2,str3 = "",str4 = "";
char c,ch;
int l,i = 0,s,j = 0,f = 0;
System.out.println("ENTER TWO SENTENCES:");
str = x.readLine();
str1 = x.readLine();
str2 = str + str1;
l = str2.length();
System.out.println("PALINDROME WORDS : ");
for(i = 0;i < l;i++)
{
c = str2.charAt(i);
if((c == ' ')||(c == '.')||(c == '?')||(c == '!')||(c == ',')||(c == ':'))
{
s = str3.length();
for(j = s-1;j >= 0;j--)
{
ch = str3.charAt(j);
str4 = str4 + ch;
}
if(str4.equals(str3))
{
System.out.println(str3);
f++;
}
str3 = "";
str4 = "";
}
else
{ 
str3 = str3 + c;
 } 
}
System.out.print("FREQUENCY OF THE PALINDROME WORDS: "+f);
 }
} 
