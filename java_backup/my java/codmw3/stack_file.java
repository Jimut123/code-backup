import java.io.*;
public class stack_file
{
     int ar[],fr=0,lt=0;
    void input()throws IOException
    {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a,c,in;
        System.out.println("Enter limit");
        a=Integer.parseInt(br.readLine());
        ar=new int[a];
        char ch=' ';
        System.out.println("Press 1 to enter element");
        System.out.println("Press 2 to delete element");
        while(ch!='N' || ch!='n')
        {
            System.out.println("Do you want to continue?");
            ch=(char)System.in.read();
            if(ch=='N' || ch=='n')
            {
                break;
            }
            System.out.println("Enter choice");
            c=Integer.parseInt(br.readLine());
            switch(c)
            {
                case 1:System.out.println("Enter element");
                in=Integer.parseInt(br.readLine());
                pop(in);
                break;
                case 2: push();
                break;
                case 3: display();
                default:
            }
        }
    }
    void pop(int k)
    {
        
        ar[lt]=k;
        lt++;
    }
    void push()throws IOException
    {
        FileWriter fr=new FileWriter("sap.txt",true);
        BufferedWriter bout=new BufferedWriter(fr);
        PrintWriter pout=new PrintWriter(bout);
        pout.println(ar[lt-1]);
        lt--;
        pout.close();
        bout.close();
        fr.close();
    }
    void display()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        input();
        display();
        
        
    }
    void main()throws IOException
    {
        input();
        display();
    }
}                  