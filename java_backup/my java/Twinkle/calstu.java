import java.io.*;
class callstu1
{
static String fileName="Stu.dat";
  public static void main(String args[])throws IOException
  {
    int n,i,m1,m2,m3,roll;
    String name,classes;
    double fees;
    
    DataInputStream dr=new DataInputStream(new FileInputStream(fileName));
    for(i=0;i<n;i++)
    {
      name=dr.readUTF();
      System.out.println("Name :"+name);
      roll=dr.readInt();
      System.out.println("Roll :"+roll);
      classes=dr.readUTF();
      System.out.println("Class :"+classes);
      m1=dr.readInt();
      System.out.println("Marks :"+m1);
      m2=dr.readInt();
      System.out.println("Marks :"+m2);
      m3=dr.readInt();
      System.out.println("Marks :"+m3);      
      total=dr.readInt();
      System.out.println("Total Marks :"+total);
      fees=dr.readDouble();
      System.out.println("Total Fees :"+fees);
      }
      }
      }