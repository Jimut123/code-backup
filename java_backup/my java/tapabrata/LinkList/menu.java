package LinkList;
import java.io.*;
class menu
{public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int k,p,ch;
node first=new node();
node abc=new node();
do
{
System.out.println(" Main menu ");
System.out.println(" Press 1 to create a linkedlist structure ");
System.out.println(" Press 2 to insert a list in the beginning ");
System.out.println(" Press 3 to insert a list in the end ");
System.out.println(" Press 4 to insert a list in the middle ");
System.out.println(" Press 5 to display the list ");
System.out.println(" Press 6 to exit ");
System.out.println(" Enter choice ");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:first.create();
       break;
case 2:System.out.println("Enter data for the new node ");
       k=Integer.parseInt(br.readLine());
       first.insertbeg(first,k);
       break;
case 3:System.out.println(" Enter data for the new node ");
       k=Integer.parseInt(br.readLine());
       first.insertend(first,k);
       break;
case 4:System.out.println(" Enter data for the new node ");
       k=Integer.parseInt(br.readLine());
       System.out.println(" Enter the node no after which node is to be inserted ");
       p=Integer.parseInt(br.readLine());
       first.insertmid(first,k,p);
       break;
case 5:System.out.println(" Your linkedlist is : ");
       first.display();
       break;
case 6:System.exit(0);
default: System.out.println("give input from among the menu integers ");
}
}while(true);
}
}