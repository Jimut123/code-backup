import java.io.*;
class prime_length
{public static void main(String args[])throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
s=br.readLine();
String w="";
int i,k,f,m;
for(i=0;i<s.length();i++)
{if(s.charAt(i)==' ')
{k=w.length();
f=0;
for(m=2;m<k;m++)
if(k%m==0)
{f=1;break;
}
if(f==0)
System.out.println(w);
w="";
}
else
w=w+s.charAt(i);
}
k=w.length();
f=0;
for(m=2;m<k;m++)
if(k%m==0)
{f=1;break;
}
if(f==0)
System.out.println(w);
w="";
}
}
