package LinkList;
import java.io.*;
class menu_merge
{
  public static void main(String args[])throws IOException
  {
      int k,p,ch;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      merge first=new merge();
      merge first1=new merge();
      do
      {
          System.out.println(" main menu ");
          System.out.println(" 1.creating a linkedlist ");
          System.out.println(" 2. merging two linkedlists ");
          System.out.println(" 3. to display the list ");
          System.out.println(" 4. to exit ");
          System.out.println(" Enter choice ");
          ch=Integer.parseInt(br.readLine());
          switch(ch)
          {
              case 1:first.create();
                     break;
              case 2:System.out.println(" create another list for merging ");
                     first1.create();
                     first.merge(first1);
                     break;
              case 3:System.out.println(" Data in the LinkedList are ::::: ");
                     first.display();
                     break;
              case 4:System.exit(0);
              default:System.out.println(" Wrong choice !!! Input from the given menu ");
            }
        }while(true);
    }
}
                     