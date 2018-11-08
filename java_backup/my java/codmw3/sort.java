import java.io.*;
public class sort
{
    int c=0;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    class input
    {
        int a=0;
        void takeinput()throws IOException
        {
            System.out.println("Enter data");
            a=Integer.parseInt(br.readLine());
        }
        input next;
    }
    input ob=new input();
    input ob2=ob;
    void fun()throws IOException
    {
       
        while(true)
        {
            ob2.takeinput();
            if(ob2.a==0)
            {
                ob2=null;
                break;
            }
            c=c+1;
            ob2.next=new input();
            ob2=ob2.next;
        }
        sorting();
        display();
    }
    void sorting()throws IOException
    {
        int r=0,m,n,k=0;
        input st1,st2;
        ob2=ob;
        for(m=0;m<c;m++)
        {
            st1=ob2; 
            st2=st1.next;
            for(n=0;n<c-1;n++)
            {
                if(st1.a>st2.a)
                {
                    k=st1.a;
                    st1.a=st2.a;
                    st2.a=k;
                }
                st1=st1.next;
                st2=st2.next;
            }
        }
    }
    void display()throws IOException
    {
        int m,n;
        input ob3=ob;
        for(m=0;m<c+1;m++)
        {
            System.out.println(+ob3.a);
            ob3=ob3.next;
        }
    }
}