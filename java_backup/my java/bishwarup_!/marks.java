import java.io.*;
class marks extends student
{
int eng;
int math;
int phy;
int total;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
super.input();
System.out.println("GIVE VALUE");
eng=Integer.parseInt(br.readLine());
math=Integer.parseInt(br.readLine());
phy=Integer.parseInt(br.readLine());
total=eng+math+phy;
System.out.println(total);
}
void displayresult()
{
super.display();
System.out.println(eng);
System.out.println(math);
System.out.println(phy);
System.out.println(total);
}
}