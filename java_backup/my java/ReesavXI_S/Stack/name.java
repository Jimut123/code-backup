package Stack;
import java.util.*;
class name
{
    String s;
    char s1[];
    int i,k,top=-1;
    name(String n)
    {
        s=n;
        s1=new char[s.length()];
    }
    void PUSH()
    {
        //Scanner sc=new Scanner(System.in);
        if(top<s.length())
        {
            s1[++top]=s.charAt(top);
            //top++;
        }
        else
        {
            System.out.println("Stack overflow");
           
        }
    }
    void POP()
    {
        if(top==-1)
        {
            System.out.println("System underflow");
        }
        else 
        {
            System.out.println("Popped element:"+s1[top]);
            top--;
        }
    }
    void display()
    {
        for(i=top;i>=0;i--)
        System.out.println(s1[i]+" ");
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("enter 1 push 2 pop 3 display 4 bye");
        k=sc.nextInt();
        switch(k)
        {
        case 1:
        PUSH();
        break;
        case 2:
        POP();
        break;
        case 3:
        display();
        break;
        case 4:
        System.exit(0);
    }
    }while(true);
}
}
        