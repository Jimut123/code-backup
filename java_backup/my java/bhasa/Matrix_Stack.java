import java.io.*;
class Matrix_Stack
{
    int a[][];
    int top=0;
    int top1=0;
    int ch,i,j,n;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void input()throws IOException
    {
        System.out.println("ENTER DIMENSIONS");
        n=Integer.parseInt(br.readLine());
        a=new int[n][n];
        choice();
    }
    
    void choice()throws IOException
    {
        System.out.println("TO PUSH ENTER '1'");
        System.out.println("TO POP ENTER '2'");
        System.out.println("TO DISPLAY ENTER '3'");
        System.out.println("ENTER CHOICE");
        ch=Integer.parseInt(br.readLine());
        if(ch==1)
        push();
        if(ch==2)
        pop();
        if(ch==3)
        disp();
    }
    
    void push()throws IOException
    {
        if(top==n-1 && top1==n-1)
        System.out.println("OVERFLOW");
        if(top<=n-1 && top1<n)
        {
            System.out.println("ENTER ELEMENT");
            a[top][top1]=Integer.parseInt(br.readLine());
            top++;
        }
        if(top==n)
        {
            top++;
            top1=0;
        }
        choice();
    }
    
    void pop()throws IOException
    {
        if(top1==0 && top==0)
        System.out.println("UNDERFLOW");
        if(top1>=0 && top<=n-1)
        top1--;
        if(top1<0)
        {
            top--;
            top1=n-1;
        }
        choice();
    }
    
    void disp()throws IOException
    {
        for(i=top;i>=0;i--)
        {
            for(j=top1;j>=0;j--)
            System.out.print(a[i][j]+" ");
            System.out.println();
        }
        choice();
    }
}
