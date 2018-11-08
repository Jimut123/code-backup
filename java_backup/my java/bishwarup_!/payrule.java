import java.io.*;
class payrule extends salary
{
int da;
int hra;
int gross;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
super.employee();
System.out.println("GIVE VALUE");
hra=Integer.parseInt(br.readLine());
da=Integer.parseInt(br.readLine());
gross=Integer.parseInt(br.readLine());
gross=hra+da+basic;
System.out.println(gross);
}
void show()
{
super.dispaly();
System.out.println(hra);
System.out.println(da);
System.out.println(gross);
}
}