import java.io.*;
class calling
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int s;
System.out.println("Give no of terms:");
s=Integer.parseInt(br.readLine());
Collection c1=new Collection(s);
c1.inputarr();
c1.sort();
c1.display();
System.out.println("Give no of terms:");
s=Integer.parseInt(br.readLine());
Collection c2=new Collection(s);
c2.inputarr();
c2.sort();
c2.display();
Collection c3=new Collection(100);
c3=c1.common(c2);
c3.sort();
c3.display();
}
}