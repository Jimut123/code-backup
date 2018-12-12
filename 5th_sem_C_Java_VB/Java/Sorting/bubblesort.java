import java.io.*;
class Bubble
{
    int a[]=new int[20];
    int id[]=new int[20];
    int n;
    Bubble(int x[],int ix[],int m)
    {
        int i;
        n=m;
        for(i=0;i<n;i++)
        {
             a[i]=x[i];
             id[i]=ix[i];
        }
    }
    void bubble()
    {
         try
          {
               int flag,pass,i,m,t;
               int choice;
               flag=0;
               pass=0;
               m=n;
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               while(flag==0)
               {
                    flag=1;
                    pass=pass+1;
                    m=m-1;
                    for(i=0;i<m;i++)
                    {
                           if(a[i]>a[i+1])
                           {
                                t=a[i];
                                a[i]=a[i+1];
                                 a[i+1]=t;
                                t=id[i];
                                id[i]=id[i+1];
                                id[i+1]=t;
                                flag=0;
                            }
                           System.out.println("Pass = "+pass+" Step no = "+(i+1));
                            display();
                           System.out.print("Press enter key-->");
                           br.readLine();
                     }
                 }
         }
         catch(Exception e)
         {}
     }
     void display()
      {
           int i;
           System.out.println("S.No\tNumber\tIndex");
            for(i=0;i<n;i++)
                 System.out.println((i+1)+"\t"+a[i]+"\t"+id[i]);
       }
}
class bubblesort
{
      public static void main(String args[])throws IOException
      {
           int a[]=new int[20];
           int id[]=new int[20];
           int i,n;
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           System.out.print("\nEnter size of your list(1-20)=");
           n=Integer.parseInt(br.readLine());
           System.out.println("\nEnter "+n+" elements one by one--->");
           for(i=0;i<n;i++)
           {
               System.out.print("a["+(i+1)+"]=");
               a[i]=Integer.parseInt(br.readLine());
               id[i]=i+1;
            }
           Bubble B=new Bubble(a,id,n);
           System.out.println("\nUnsorted List");
            B.display();
            B.bubble();
            System.out.println("\nSorted List");
            B.display();
        }
}