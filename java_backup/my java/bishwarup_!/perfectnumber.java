import java.io.*;
class perfectnumber
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,s,j;
System.out.println("Give the term");
n=Integer.parseInt(br.readLine());
s=0;
for(j=1;j<=n;j++)
{
s=0;
for(i=1;i<j;i++)
{
if(j%i==0)
s=s+i;
}
if(s==j)
System.out.println(j+" is a perfect number");

}
}
}

