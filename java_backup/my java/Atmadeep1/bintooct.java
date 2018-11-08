import java.io.*;
class bintooct
{
String w="",w1="",w2="";
int c,i,j;
void cal(String s)
{
for(i=0;i<s.length();i++)
{
if(s.charAt(i)=='.')
break;
else
w=w+s.charAt(i);
}
//System.out.println("W"+w.length());
if((w.length()%3)!=0)
{
System.out.println("Wrong bit stream:");
System.exit(0);
}
for(j=i+1;j<s.length();j++)
{
w1=w1+s.charAt(j);
}
//System.out.println(w1.length());
if((w1.length()%3)!=0)
{
System.out.println("Wrong bit stream:");
System.exit(0);
}
c=0;
//System.out.println("W"+w);
for(i=0;i<w.length();i++)
{
//System.out.println("W"+w.charAt(i));
w2=w2+w.charAt(i);
c++;
if(c>=3)
{
//System.out.println("W2"+w2);
if(w2.compareTo("000")==0)
System.out.print("0");
else if(w2.compareTo("001")==0)
System.out.print("1");
else if(w2.compareTo("010")==0)
System.out.print("2");
else if(w2.compareTo("011")==0)
System.out.print("3");
else if(w2.compareTo("100")==0)
System.out.print("4");
else if(w2.compareTo("101")==0)
System.out.print("5");
else if(w2.compareTo("110")==0)
System.out.print("6");
else if(w2.compareTo("111")==0)
System.out.print("7");
w2="";
c=0;
}

}
if(w1.length()>0)
{
System.out.print(".");
c=0;
for(i=0;i<w1.length();i++)
{
w2=w2+w1.charAt(i);
c++;
if(c>=3)
{
//System.out.println("W2"+w2);
if(w2.compareTo("000")==0)
System.out.print("0");
else if(w2.compareTo("001")==0)
System.out.print("1");
else if(w2.compareTo("010")==0)
System.out.print("2");
else if(w2.compareTo("011")==0)
System.out.print("3");
else if(w2.compareTo("100")==0)
System.out.print("4");
else if(w2.compareTo("101")==0)
System.out.print("5");
else if(w2.compareTo("110")==0)
System.out.print("6");
else if(w2.compareTo("111")==0)
System.out.print("7");
w2="";
c=0;
}
}
}
}
}























