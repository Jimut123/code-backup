package iisscc;
import java.util.*;
class sentence
{
public static void main(int n)
{
Scanner ob=new Scanner (System.in);
int i,j,f=0,k,mxf=0,m=0;
String s[]=new String [n];
String os="",wd="",ns="";
if(n==0 || n>6)
{
System.out.println("enter limit >=1 and <=6  ");
System.exit(0);
}
System.out.println("enter the paragraph : ");
os=ob.nextLine();
for(i=0;i<os.length();i++)
if(os.charAt(i)=='.'||os.charAt(i)=='?')
f++;
if(f!=n)
{
System.out.println("enter "+n+" sentence .");
System.exit(0);
}
for(i=0;i<n;i++)
s[i]="";
j=0;
for(i=0;i<os.length();i++)
{
s[j]=s[j]+os.charAt(i);
if(os.charAt(i)=='.' || os.charAt(i)=='?')
{
if(i<os.length()-1)
if(os.charAt(i+1)==' ')
continue;
j++;
}
}
System.out.println("original paragraph : ");
for(i=0;i<j;i++)
System.out.println(s[i]);
f=j;
for(i=0;i<f;i++)
for(j=0;j<s[i].length();j++)
if(s[i].charAt(j)==' ' || s[i].charAt(j)=='.' || s[i].charAt(j)=='?')
{
if(wd.length()>mxf)
mxf=wd.length();
wd="";
}
else
wd+=s[i].charAt(j);
for(k=1;k<=mxf;k++)
for(i=0;i<f;i++)
for(j=0;j<s[i].length();j++)
if(s[i].charAt(j)==' ' || s[i].charAt(j)=='.' || s[i].charAt(j)=='?')
{
m=wd.length();
if(m==k)
ns=ns+wd+" ";
wd="";
m=0;
}
else
wd+=s[i].charAt(j);
System.out.println(" line with word arranged in ascending order of its length :"+ns);
}
}

