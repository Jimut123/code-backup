import java.util.*;
class cross
{
void sum()
{
Scanner sc=new Scanner(System.in);
String a; 
int b,c,d=1,e,g,i;
System.out.println("ENTER STRING");
a=sc.nextLine();
g=a.length();
for(b=0;b<a.length()/2;b=b+1)
{
for(c=0;c<d;c=c+1)
{
System.out.print(" ");
}
d++;
System.out.print(a.charAt(b));
for(e=0;e<g;e=e+1)

{
System.out.print( " ");
}
g=g-2;
System.out.println(a.charAt(b));
}
//2nd part
for(i=0;i<(a.length()/2)+2;i=i+1)
{
System.out.print(" ");
}
System.out.println(a.charAt(a.length()/2));
for(b=(a.length()/2)+1;b<a.length();b=b+1)
{
for(c=0;c<d;c=c+1)
{
System.out.print( " ");}
d--;
System.out.print(a.charAt(b));
for(e=0;e<g+1;e=e+1)
{
System.out.print(" ");
}
System.out.println(a.charAt(b));
g=g+2;
}}}