import java.io.*;
class telephone_file
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("tfile.dat")));
String nm="",ch="",ad="";int pn;
do
{
System.out.println("give the name of the customer :");
nm=br.readLine();
pw.println(nm);
System.out.println("give the phone number :");
pn=Integer.parseInt(br.readLine());
pw.println(pn);
System.out.println("give the address of the customer :");
ad=br.readLine();
pw.println(ad);
System.out.println("want to give more names ? (y/n) :");
ch=br.readLine();
}while(ch.equalsIgnoreCase("y")==true);
pw.close();
pw=new PrintWriter(new BufferedWriter(new FileWriter("telephone.dat")));
BufferedReader ob=new BufferedReader(new FileReader("tfile.dat"));
String s="";char w;
int i,f=0;
System.out.println("Output of File :");
while((s=ob.readLine())!=null)
{
//System.out.println(s);
//w=s.charAt(0);

if(s.charAt(0)=='A'||s.charAt(0)=='a'||s.charAt(0)=='E'||s.charAt(0)=='e'||s.charAt(0)=='I'||s.charAt(0)=='i'||s.charAt(0)=='O'||s.charAt(0)=='o'||s.charAt(0)=='U'||s.charAt(0)=='u')
System.out.println("Output of the Telephone record file : ");
System.out.println(s);

}
ob.close();
ob=new BufferedReader(new FileReader("telephone.dat"));
System.out.println("These are the names of the customers starting with vowel ");


}
}




