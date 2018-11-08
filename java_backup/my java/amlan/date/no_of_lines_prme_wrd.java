package date;

class no_of_lines_prme_wrd
{
public static void main(String s)
{
System.out.println("Origianl String ::: \n"+s);
System.out.println("");
s=s+" ";
String w,w1,w2;
String w3[]=new String[100];
w=w1=w2="";
int i,j,l,f,f1,k,c,k1,t,m,f2;
c=0;
t=0;
for(i=0;i<s.length();i++)
{
if(s.charAt(i)==',')
c++;
}
System.out.println("Number of line(s) ended with comma(,) are ::: \n"+c);
System.out.println("");
System.out.println("Words with prime frequency from each line ending with comma are :::");
for(i=0;i<s.length();i++)
{
w1="";
if(s.charAt(i)==','||s.charAt(i)=='.')
{
w=w+" ";
t=0;
for(j=0;j<w.length();j++)
{
if(w.charAt(j)==' ')
{
f2=0;
for(l=0;l<t;l++)
{
if(w3[l].equalsIgnoreCase(w1)==true)
{
f2=1;
break;
}
}
if(f2==0)
{
w3[t++]=w1;
f=0;
for(k=0;k<w.length();k++)
{
if(w.charAt(k)==' ')
{
if(w1.equalsIgnoreCase(w2)==true)
{
f++;
}
w2="";
}
else
w2=w2+w.charAt(k);
}
f1=0;
for(m=2;m<f;m++)
{
if(f%m==0)
{
f1=1;
break;
}
}
if(f1==0)
{
System.out.println("word : "+w1+", prime frequency : "+f);
}
}
w1="";
}
else
w1=w1+w.charAt(j);
}
w="";
}
else
w=w+s.charAt(i);
}
}
}
