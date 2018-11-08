import java.io.*;
class toggle
{public static void main(String args[])throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,l;
String str,str1="";
char chr,chr1;

System.out.println("Enter a string");
str=br.readLine();
l=str.length();
for(i=0;i<l;i++)
{chr=str.charAt(i);
if(chr>='A' && chr<='Z')
{chr1=Character.toLowerCase(chr);
str1=str1+chr1;
}
if(chr>='a' && chr<='z')
{chr1=Character.toUpperCase(chr);
str1=str1+chr1;
}
if(chr==' ')
str1=str1+"";
}
System.out.println(str1);
}
}