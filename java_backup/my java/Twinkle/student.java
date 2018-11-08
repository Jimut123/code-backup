import java.io.*;
class student
{
static String fileName="Stu.dat";
static BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
  public static void main(String args[])throws IOException
  {
    int n,i,m1,m2,m3,roll,total;
    String name,classes;
    double fees;
    
    DataOutputStream dw=new DataOutputStream(new FileOutputStream(fileName));
    System.out.println("Enter n:");
      n=Integer.parseInt(input.readLine());
    for(i=0;i<n;i++)
    {
      System.out.println("Enter name of student:");
      name=input.readLine();
      dw.writeUTF(name);
      System.out.println("Enter roll no.:");
      roll=Integer.parseInt(input.readLine());
      dw.writeInt(roll);
      System.out.println("Enter class of student:");
      classes=input.readLine();
      dw.writeUTF(classes);
      System.out.println("Enter marks of subject1:");
      m1=Integer.parseInt(input.readLine());
      dw.writeInt(m1);
      System.out.println("Enter marks of subject2:");
      m2=Integer.parseInt(input.readLine());
      dw.writeInt(m2);
      System.out.println("Enter marks of subject3:");
      m3=Integer.parseInt(input.readLine());
      dw.writeInt(m3); 
      total=m1+m2+m3;
      dw.writeInt(total);
      System.out.println("Enter fees structure:");
      fees=Double.parseDouble(input.readLine());
      dw.writeDouble(fees); 
      }
      dw.close();
      }
      }