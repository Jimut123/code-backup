import java.io.*;
class consecutive
{public static void main(String args[])throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int x=0,y=0;
String a;
char ch1,ch2;
System.out.println("Enter String");
a=br.readLine();
x=a.length();
for(y=0;y<x-1;y++)
{ch1=a.charAt(y);
ch2=a.charAt(y+1);
if(ch1==ch2-1)
System.out.println(ch1+" "+ "and"+" "+ ch2+" "+ "are consecutive");
}
}
}

