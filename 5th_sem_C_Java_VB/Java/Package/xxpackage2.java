//xxpackage2.java : Write main program to use sorting
import java.io.*;
import package_sorting.Sorting;
class xxpackage2
{
  public static void main(String args[])throws IOException
  {
    int a[] = new int[10];
    int i,n;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int choice;
    System.out.print("\nEnter size of your list(1-10) = ");
    n=Integer.parseInt(br.readLine());
    System.out.println("\nEnter "+n+" elements one by one--->");
    for(i=0;i<n;i++)
    {
      System.out.print("a["+(i+1)+"] = ");
      a[i]=Integer.parseInt(br.readLine());
    }
    System.out.println("Unsorted List");
    for(i=0;i<n;i++)
      System.out.print(a[i]+"\t");
    Sorting s = new Sorting();
    System.out.println();
    do
    {
      System.out.println("\nType 1 for Bubble Sort");
      System.out.println("Type 2 for Insertion Sort");
      System.out.print("Type any other number to exit : ");
      choice=Integer.parseInt(br.readLine());
      if(choice==1)
        s.bubble(a,n);
      if(choice==2)
        s.insertion(a,n);
    }while(choice==1 || choice==2);
  }
}