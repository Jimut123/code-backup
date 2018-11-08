import java.io.*;
class commission
{
public static void main (String args []) throws IOException 
{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
int i,s,k,c;
s=0;
for(i=1;i<=7;i++)
{
System.out.println("Enter Sales values:");
k=Integer.parseInt(br.readLine());
s=s+k;
}
if(s<=25000)
c=(int)(s*2.5);
else
if(s<=35000)
c=(int)(s*.05);
else
if(s<=50000)
c=(int)(s*7.5);
else
if(s<=65000)
c=(int)(s*.09);
else
c=(int)(s*.12);
System.out.println("Total commission:"+c);
}
}