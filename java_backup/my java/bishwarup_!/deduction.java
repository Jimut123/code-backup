import java.io.*;
class deduction extends payrule
{
int pf;
int it;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void takeinput()throws IOException
{
super.input();
System.out.println("GIVE VALUE");
pf=Integer.parseInt(br.readLine());
it=Integer.parseInt(br.readLine());
}
}