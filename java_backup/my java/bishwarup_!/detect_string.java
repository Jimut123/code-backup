import java.io.*;
class detect_string
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int i,loc;
loc=0;
String detect;
boolean p=false;
String m[]=new String[50];
for(i=0;i<20;i++)
{
System.out.println("ENTER NAME IN THE CELL"+(i+1)+":");
m[i]=br.readLine();
}
System.out.println("ENTER THE NAME TO BE SEARCHED");
detect=br.readLine();
for(i=0;i<20;i++)
{
if(m[i].equals(detect))
{
loc=i+1;
p=true;
}
}
if(p==true)
System.out.println("SEARCHED"+detect+"String"+loc);
else
System.out.println("ERROR"+detect);
}
}