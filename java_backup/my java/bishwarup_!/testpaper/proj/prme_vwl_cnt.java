package testpaper.proj;

class prme_vwl_cnt
{
public static void main(String s)
{
System.out.println("input String : \n"+s);
String w="";
int i,j,v=0,f=0;
char c;
s=s+" ";
for(i=0;i<s.length();i++)
{
if(s.charAt(i)==' ')
{
v=0;
for(j=0;j<w.length();j++)
{
c=w.charAt(j);
if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
v++;
}
if(v>0)
{
f=0;
for(j=2;j<v;j++)
if(v%j==0)
{
f=1;
break;
}
if(f==0)
System.out.println("word having prime vowel count : "+w);
}
w="";
}
else
w=w+s.charAt(i);
}
}
}
