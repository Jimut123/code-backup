import java.util.*;
public class consecutive_2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter no.");
int n=sc.nextInt();
int m=n;
int t=0;
int s=20;
int jo=10;
int f=0;
char abcd=' ';
while(m>0)
{
m=m/10;
t++;
}
String w=Integer.toString(n);
for(int hlk=0;hlk<w.length();hlk++)
{
String ghi="";
ghi=ghi+w.charAt(hlk);
int df=Integer.parseInt(ghi);
if(df<jo)
{
 abcd=w.charAt(hlk);
 jo=df;
}
}
int d=-1;
String fu="";
char ui=' ';
String h=w;
for(int i=0;i<t;i++)
{
for(int j=0;j<h.length();j++)
{
String g="";
g=g+h.charAt(j);
int b=Integer.parseInt(g);
if(b<jo)
{
 ui=w.charAt(j);
 jo=b;
}

}

String hu="";
for(int k=0;k<h.length();k++)
if(h.charAt(k)==ui)
{
fu=fu+h.charAt(k);
}
else
{
hu=hu+h.charAt(k);
}
h=hu;
}
String fu2="";

System.out.println(h);
//fu2=fu2+abcd;
//fu2=fu2.concat(h);

fu2=h;
System.out.println(fu2);
int fl=fu2.length()-1;
int counter=0;
for(int i=0;i<fl;i++)
{
 String xyz="";
 xyz=xyz+fu2.charAt(i);
 String jkl="";
 jkl=jkl+fu2.charAt(i+1);
 int b1=Integer.parseInt(xyz);
 int b2=Integer.parseInt(jkl);
 int diff=b2-b1;
 
 if(diff==1)
 {
    
     counter=counter+1;
    }
    
}

int kill=w.length()-1;

 if(counter==kill)
{
System.out.println("Consecutive number");
}
else
{
System.out.println("Not a Consecutive number");
}

}
}

     

