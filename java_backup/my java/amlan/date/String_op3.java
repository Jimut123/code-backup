package date;

import java.util.*;
class String_op3  
{
public void main1(int n)
{
Scanner ob=new Scanner (System.in);
String s[]=new String [3];
String os="",wd="",ns="";
int i=0,j,k,w=0,f=0,mxf=0,m=0;
if(n<0 || n>=4)
{
System.out.println("\nenter limit >=1 and <4 ....");
System.exit(0);
}
System.out.println("\nenter the paragraph ::: ");
os=ob.nextLine();
//os=space(os);
if(check(os)==1 && count(os)<=n)
{
 wordcount(os);
 arrange(os);
   }
   else
   {
       System.out.println("Must be in uppercase or Count mismatch.......");
       System.exit(0);
    }
    
}
   int check(String s)
   {
       int f=1,i;
       
for(i=0;i<s.length();i++)
if(s.charAt(i)>=97 && s.charAt(i)<=122)
{
f=0;
break;
}
return f;
}
void wordcount(String s)
   {
       int wd=0,i;
       
for(i=0;i<s.length();i++)
if(s.charAt(i)==' '|| s.charAt(i)=='.'||s.charAt(i)=='?')
{
wd++;

}
//wd++;
if(s.charAt(s.length()-1)=='.' || s.charAt(s.length()-1)=='?')
System.out.println("Total words:"+wd);
else
System.out.println("Total words:"+(wd+1));
}
void arrange(String s)
{
s=s+" ";
int i,j,k,f;
String w,w1;
w=w1="";
for(i=1;i<=s.length();i++)
{
for(j=0;j<s.length();j++)
{
if(s.charAt(j)==' '||s.charAt(j)=='.'||s.charAt(j)=='?'  )
{
f=0;
for(k=0;k<s.length();k++)
{
if(s.charAt(k)==' '||s.charAt(k)=='.'||s.charAt(k)=='?')
{
if(w1.equalsIgnoreCase(w)==true)
{
f++;
}
w1="";
}
else
w1=w1+s.charAt(k);
}
if(f==i)
System.out.print(w+" ");
w="";
}
else
w=w+s.charAt(j);
}
}
}
int count(String s)
{
int c=0,i;
for(i=0;i<s.length();i++)
if(s.charAt(i)=='?'||s.charAt(i)=='.')
 c++;
 return c;
}
//String space(String os)
//{
//int i,k,p;
//String s1="";
//k=0;
//for(i=0;i<os.length();i++)
//{
//if(os.charAt(0)==' ')
//{
//while(os.charAt(i)==' ')
//i++;
//}
}

   
  
