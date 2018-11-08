import java.io.*;
public class Quack
{
    int a[]=new int[50];
    int b[]=new int[10];
    int f=-1;
    int r=-1;
    int p=-1;
    DataInputStream in=new DataInputStream(System.in);
    void push(int k) throws IOException
    {
        if(p!=9)
        {
            p++;
        }
        if(p<10)
        {
            b[p]=k;
        }
    }
    void insert() throws IOException
    {
        System.out.println("insert");
        int k=Integer.parseInt(in.readLine());
        if(f<0)
        {
            a[++f]=k;
            ++r;
        }
        else
        {
            a[++r]=k;
        }
    }
    void insert2(int k) throws IOException
    {
        
        if(f<0)
        {
            a[++f]=k;
            ++r;
        }
        else
        {
            a[++r]=k;
        }
    }
    void del() throws IOException
    {
        push(a[f]);
        f++;
    }
    void restore() throws IOException
    {
        insert2(b[p]);
        p--;
    }
    void display() throws IOException
    {
        for(int i=f;i<=r;i++)
        {
            System.out.print(" "+a[i]);
        }
        System.out.println();
    }
    void impl() throws IOException
    {
        for(;;)
     {
       System.out.println("1-insert 2-del 3-restore 4-display 5-exit");
       switch(Integer.parseInt(in.readLine()))
       {
            case 1:
            insert();
            break;
            case 2:
            del(); break;
            case 3:
            restore(); break;
            case 4:
            display(); break;
            case 5:
            System.exit(0);
       }
     }
    }
}
    