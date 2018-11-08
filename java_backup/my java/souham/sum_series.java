import java.io.*;
class sum_series
{
public static void main()throws IOException 
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int x,y,z;
x=Integer.parseInt(br.readLine());
y=Integer.parseInt(br.readLine());
z=((x*x)+(y*y))/(x+y);
System.out.print(z);
}
}