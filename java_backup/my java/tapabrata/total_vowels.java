import java.io.*;
class total_vowels
{public static void main(String args[])throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
System.out.println("Give String:");
s=br.readLine();
String w="";
s=s+"";
int i,c,j;
for(i=0;i<s.length();i++)
{if(s.charAt(i)==' ')
{c=0;
for(j=0;j<w.length();j++)
{if(w.charAt(j)=='A'||w.charAt(j)=='a'||w.charAt(j)=='E'||w.charAt(j)=='e'||w.charAt(j)=='I'||w.charAt(j)=='i'||w.charAt(j)=='O'||w.charAt(j)=='o'||w.charAt(j)=='U'||w.charAt(j)=='u')
c++;
}
System.out.println(w + "," +c);
w="";

}
else
w=w+s.charAt(i);
}
}
}
