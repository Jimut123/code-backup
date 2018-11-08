
import java.io.*;
public class cw
{
	
public static void main()throws IOException
{
int c,s,p;
c=s=0;
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
System.out.println("Enter the number of sons");
int son=Integer.parseInt(input.readLine());
soncow ob=new soncow(son);
p=(c*(c+1))/(2*son);
int q=p;
for(int k=0;k<son;k++)
{
p=q;
System.out.println();
for(int f=0;f<son;f++)
{
System.out.print(""+ob.great(p)+"");
p=p-ob.great(p);
if(f==(s-2))
{
int h=ob.last2(p);
System.out.print(""+(h%10)+"");
System.out.print(""+(h/10)+"");
break;
}
break;
}
}
}
}
