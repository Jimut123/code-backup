import java.io.*;
class sqrt
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double i;double n;
System.out.print("Enter the number");
n=Double.parseDouble(br.readLine());
for( i=.1;i<=n;i=i+.1)
{
    if((i*i)==n)
    {System.out.println(i);
        break;
    }
    else 
    if((i*i)>n)
    {System.out.println(i-.1);
        break;
}
}
}
}