import java.util.*;
class two_complement
{
String n=" ";
two_complement(String num)
{
n=num;
}
void calc()
{
int i=0,j=0;
String z=" ";
for(i=n.length()-1;i>=0;i--)
{
if(n.charAt(i)!='1')
{
z=z+n.charAt(i);
}
else
{
for(j=0;j<i;j++)
{
if(n.charAt(j)=='0')
z=z+"1";
else
z=z+"0";
}
z=z+"1";
break;
}
}
System.out.print(z);
}
}
