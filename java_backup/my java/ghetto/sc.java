import java.util.*;
public class sc
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
int a,d,b,e,t,g;
System.out.println("enter the limit");
b=sc.nextInt();
int c[]=new int[b];
for(a=0;a<b;a=a+1)
{
System.out.println("ENTER THE VALUE");
c[a]=sc.nextInt();
}
for(d=0;d<b;d=d+1)
{

for(e=0;e<b-d-1;e=e+1)
{
if(c[e]>c[e+1])
{
t=c[e];
c[e]=c[e+1];
c[e+1]=t;
}
}}
for(g=0;g<b;g=g+1)
{
System.out.println(+c[g]);
}}}