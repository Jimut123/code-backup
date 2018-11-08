package LinkList;
import java.io.*;
class menustk
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Linkstack ob=new Linkstack();
do
{
System.out.println(" Main menu ");
System.out.println(" Press 1 to push element ");
System.out.println(" Press 2 to pop element ");
System.out.println(" Press 3 to display stack ");
System.out.println(" Press 4 to exit ");
System.out.println(" Enter choice ");
int ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:int item;
       item=Integer.parseInt(br.readLine());
       ob.push(item);
       break;
case 2:ob.pop();
       break;
case 3:ob.displaystack();
       break;
case 4:System.exit(0);
}
}while(true);
}
}
