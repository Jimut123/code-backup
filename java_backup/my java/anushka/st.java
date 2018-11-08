
import java.io.*;
public class st
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String name,roll,sec;
    int i;int n;
    void Input()throws IOException
    {
        name=br.readLine();
        roll=br.readLine();
        sec=br.readLine();
    }
    void Show()
    {
        System.out.println(name);
        System.out.println(roll);
        System.out.println(sec);
    }
    void Put()throws IOException
    {
     FileOutputStream fw=new FileOutputStream("STUDENT.dat");
DataOutputStream dw=new DataOutputStream(fw);
        
     for(i=1;i<=2;i++)
     {
         Input();
         Show();
         dw.writeUTF(name);
         dw.writeUTF(roll);
         dw.writeUTF(sec);
        }
        dw.close();
    }
    void Edit()throws IOException
    {FileInputStream fr=new FileInputStream("STUDENT.dat");
DataInputStream de=new DataInputStream(fr);
FileOutputStream fw=new FileOutputStream("STUDENT1.dat");
DataOutputStream dw=new DataOutputStream(fw);
System.out.println("Give searching code");
String s2;
s2=br.readLine();
boolean EOF=false;
int k=1;
while(k<=2)
{
try
{
String s,s1,s3;
s=de.readUTF();
s1=de.readUTF();
s3=de.readUTF();
if(s2.compareTo(s1)==0)
{
System.out.println("Name:"+s);
System.out.println("Code:"+s1);
System.out.println("Section:"+s3);
Input();
dw.writeUTF(name);
dw.writeUTF(roll);
dw.writeUTF(sec);
//break;
}
else
{
dw.writeUTF(s);
dw.writeUTF(s1);
dw.writeUTF(s3);
}
}
catch(Exception e)
{
}
k++;
    }
    fr.close();
    de.close();
    fw.close();
    dw.close();
    File f=new File("STUDENT.dat");
    boolean b1=f.delete();
    File f1=new File("STUDENT1.dat");
    File f3=new File("STUDENT.dat");
    if(f1.renameTo(f3))
    System.out.println("Renamed Successfully....");
}
}
     