import java.io.*;
class vowelcheck
{
int i,k,l,s,v;
void input()throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter The No.");
String n=Input.readLine();
v=0;
k=checkvowel(n,i);
System.out.println(k);
}
int checkvowel(String s,int i)
{

if(i>=s.length())
return v;
else 
{
if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
{
v++;
}
return(checkvowel(s,i+1));
}
}
}


