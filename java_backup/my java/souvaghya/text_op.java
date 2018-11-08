
import java.util.*;
class text_op
{
public static void main()
{
Scanner ob=new Scanner (System.in);
int i,j,n=0,k,mxf=0,m=0,c=0,f=0,t=0;
String os="",wd="",ns="",ms="";
System.out.println("\nenter the paragraph ::: ");
os=ob.nextLine();
os=os+" ";
for(i=0;i<os.length();i++)
if(os.charAt(i)=='.' || os.charAt(i)=='!' || os.charAt(i)=='?')
n++;
String s[]=new String [n];
for(i=0;i<n;i++)
s[i]="";
j=0;
for(i=0;i<os.length();i++)
{
s[j]=s[j]+os.charAt(i);
if(i>0 && os.charAt(i)==' ')
if(os.charAt(i-1)=='.' || os.charAt(i-1)=='!' || os.charAt(i-1)=='?')
j++;
}
System.out.println("\noriginal paragraph ::: ");
for(i=0;i<j;i++)
System.out.println(s[i]);
n=j;
for(i=0;i<n;i++)
{
c=0;
for(j=0;j<s[i].length();j++)
if(s[i].charAt(j)==' ' || s[i].charAt(j)=='.' || s[i].charAt(j)=='!' || s[i].charAt(j)=='?')
{
if(s[i].charAt(j-1)=='.' || s[i].charAt(j-1)=='!' || s[i].charAt(j-1)=='?')
wd="";
else
{
c++;
if(c>f)
f=c;
wd="";
}
}
else
wd+=s[i].charAt(j);
}
for(i=0;i<n;i++)
{
c=0;
for(j=0;j<s[i].length();j++)
if(s[i].charAt(j)==' ' || s[i].charAt(j)=='.' || s[i].charAt(j)=='!' || s[i].charAt(j)=='?')
{
if(s[i].charAt(j-1)=='.' || s[i].charAt(j-1)=='!' || s[i].charAt(j-1)=='?')
wd="";
else
{
c++;
if(c==f)
t=i;
wd="";
}
}
else
wd+=s[i].charAt(j);
}
for(i=0;i<n;i++)
if(i==t)
for(j=0;j<s[i].length();j++)
if(s[i].charAt(j)==' ' || s[i].charAt(j)=='.' || s[i].charAt(j)=='!' || s[i].charAt(j)=='?')
{
if(s[i].charAt(j-1)=='.' || s[i].charAt(j-1)=='!' || s[i].charAt(j-1)=='?')
wd="";
else
{
ms=ms+wd+" ";
if(wd.length()>mxf)
mxf=wd.length();
wd="";
}
}
else
wd+=s[i].charAt(j);
for(i=0;i<n;i++)
if(i==t)
for(k=1;k<=mxf;k++)
for(j=0;j<s[i].length();j++)
if(s[i].charAt(j)==' ' || s[i].charAt(j)=='.' || s[i].charAt(j)=='!' || s[i].charAt(j)=='?')
{
if(s[i].charAt(j-1)=='.' || s[i].charAt(j-1)=='!' || s[i].charAt(j-1)=='?')
wd="";
else
{
m=wd.length();
if(m==k)
ns=ns+wd+" ";
wd="";
m=0;
}
}
else
wd+=s[i].charAt(j);
System.out.println("\nline with maximum number of words ::: \n"+ms);
System.out.println("\nline(s) with word(s) arranged in ascending order of its length ::: \n"+ns);
}
}
