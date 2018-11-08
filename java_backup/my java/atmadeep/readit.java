import java.io.*;
class readit
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String fileName=new String("line.dat");
FileInputStream fr=new FileInputStream(fileName);
DataInputStream dr=new DataInputStream(fr);
String s;
int c=0,i,n;
int k=0;
//boolean EOF=false;
System.out.println("Give numbers of lines:");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
//if(EOF)
//break;
//if(dr.readUTF()==null)
//break;
s=dr.readUTF();
System.out.println(s);
int l=s.length();
k=0;
for(int i1=0;i1<l;i1++)
{
if(s.charAt(i1)==' ')
{
k++;
c=c+k;
k=0;
}
}
k++;
//System.out.print(k);
c=c+k;
//System.out.println(c);
}
System.out.print(c);
}

}