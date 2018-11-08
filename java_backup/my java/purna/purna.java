
import java.io.*;
class purna
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
student obj=new student();
obj.input();
obj.average();
obj.print();
}
}