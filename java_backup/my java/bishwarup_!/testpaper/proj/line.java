package testpaper.proj;

class line
{
public String s="",w="";
public int i;
void input(String s1)
{
s=s1+" ";
System.out.println("original line : \n"+s);
func(s);
}
void func(String s)
{
System.out.println("extracted words : ");
for(i=0;i<s.length();i++)
{
if(s.charAt(i)==' ')
{
System.out.println(w);
w="";
}
else
w=w+s.charAt(i);
}
word a=new word ();
a.rev(s);
}
class word
{
void rev(String s)
{
String w1="";
System.out.println("new line with each word reversed : ");
for(i=0;i<s.length();i++)
{
if(s.charAt(i)==' ')
{
for(int j=w.length()-1;j>=0;j--)
w1=w1+w.charAt(j);
w1=w1+" ";
w="";
}
else
w=w+s.charAt(i);
}
System.out.println(w1);
}
}
}
