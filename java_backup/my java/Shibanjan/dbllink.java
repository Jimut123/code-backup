 


import java.io.*;
class dbllink
{
int x;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
System.out.println("Give no:");
x=Integer.parseInt(br.readLine());
}
void disp()
{
System.out.println(x);
}
dbllink next;
dbllink prev;
}
