import java.io.*;
class Num_word
{
public static void main(String args[])throws IOException 
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,n1,len,num=0,l;
int a[]=new int[4];
String word[]={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","tewnty","thirty","forty","fifty","sixty","seventy","eighty","ninety","hundred","thousand"};
System.out.println(" Enter a a number ");
n=Integer.parseInt(br.readLine());
n1=n;i=4;l=0;
while(n1>0)
{
a[i]=n1%10;
n1=n1/10;
}
while(i!=0)
{
a[i]=0;
}
if(a[0]!=0)
{
System.out.print(word[a[0]-1] +"" +word[28] +"");
}
if(a[1]!=0)
{
System.out.print(word[a[1]-1] +"" + word[27] +"");
}
if(a[2]!=0)
{
if(a[2]>=2)
{
System.out.print(word[a[2]+17] +"");

if(a[3]!=0)
System.out.print(word[a[3]-1] +"");
}
if(a[2]==1)
{
System.out.print(word[a[3]+9] +"");
}
}
else
if(a[2]==0&&a[3]!=0)
System.out.print(word[a[3]-1] +"");
}
}