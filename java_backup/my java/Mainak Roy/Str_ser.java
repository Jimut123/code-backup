import java.util.*;
public class Str_ser
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter string");
String w=sc.nextLine();
int al=1;
w=w.trim();
for(int i=0;i<w.length();i++)
{
if(w.charAt(i)==' ')
{
al++;
}
}

String m[]=new String[al];
int h=0;
m[0]="";
for(int j=0;j<w.length();j++)
{
 if(w.charAt(j)==' ')
 {
     h=h+1;
     m[h]="";
    }
    else
    {
    m[h]=m[h]+w.charAt(j);
}
}

for(int k=0;k<al/2;k++)
{
System.out.print(m[k]+" ");
int l=al-k-1;
if(k==l)
{
break;
}
System.out.print(m[al-k-1]+" ");
}
if(al%2!=0)
{
System.out.println(m[al/2]);
}
}
}
    
