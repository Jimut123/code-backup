import java.io.*;
class prime_vowels
{public static void main(String args[])throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
s=br.readLine();
s=s+" ";
String w="";
int i,k,f,m,j,v;
for(i=0;i<s.length();i++)
{if(s.charAt(i)==' ')
{
v=0;
for(j=0;j<w.length();j++)
if(w.charAt(j)=='A'||w.charAt(j)=='a'||w.charAt(j)=='E'||w.charAt(j)=='e'||w.charAt(j)=='I'||w.charAt(j)=='i'||w.charAt(j)=='O'||w.charAt(j)=='o'||w.charAt(j)=='U'||w.charAt(j)=='u')
 v++;
f=0;
for(m=2;m<v;m++)
if(v%m==0)
{f=1;break;
}
if(f==0)
System.out.println(w);
w="";
}
else
w=w+s.charAt(i);
}

}
}
