import java.io.*;
class sales
{
public static void main()throws IOException 
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i=0,n,a=1500;
n=Integer.parseInt(br.readLine());
if((n+a)>5000 && (n+a)<10000)
i=(12/100*n);
if((n+a)>10000 && (n+a)<15000)
i=(15/100*n);
if((n+a)>15000 )
i=(18/100*n);
System.out.println(i);
}
}