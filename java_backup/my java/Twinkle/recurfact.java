import java.io.*;
class recurfact
{
int c=1,n,f=1;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

void input()throws IOException
{
System.out.println("Enter no.:");
n=Integer.parseInt(input.readLine());
fact();
    }
void fact()
{
if(c<=n)
{
f=f*c;
 c++;
    fact();    
}
   
    else
    {
        System.out.println(f);
    return;
}
}

}