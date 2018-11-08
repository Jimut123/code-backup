package link_list;
import java.io.*;
class list
    {
        DataInputStream in=new DataInputStream(System.in);
        int k;
        void insert()throws IOException
        {
            System.out.print("Enter digit ");
            k=Integer.parseInt(in.readLine());
        }
        void show()throws IOException
        {
            System.out.print(k+" ");
        }
        list next;
    }