import java.io.*;
class ticket
{
public static void main()throws IOException 
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n;
n=Integer.parseInt(br.readLine());
    if ( n>=5 && n<18 )
System.out.print("3");
else 
if(n>=18)
System.out.print("5");
}
}