//this class will convert infix expressions to postfix
import java.util.*;
class Stack
{
    private char arr[];
    private int top;
    public Stack(int size)
    {
        arr=new char[size];
        top=-1;
    }

    public boolean isEmpty()
    {
        return top==-1;
    }

    public void push(char ch)
    {
        if(top+1<arr.length) arr[++top]=ch;
        else System.out.println("Error: Stack Overflow!");       
    }

    public char pop()
    {
        if(isEmpty()) return '\u0000';
        else return arr[top--];
    }

    public int find(char ch)
    {
        int pref=-1;
        if("+-".indexOf(ch)!=-1) pref=1;
        else if("*/".indexOf(ch)!=-1)pref=2;
        return pref;
    }
}

class InfixPostfix
{
    private String stack;
    private Stack stk;
    public InfixPostfix(String stk)
    {
        stack=stk;
        this.stk=new Stack(stack.length());
    }

    public void show()
    {
        System.out.println("Infix expression: " + stack + "\nPostfix expression: " + getPost());
    }

    public String getPost()
    {
        String output="";
        for(int i=0; i<stack.length(); i++)
        {
            char ch=stack.charAt(i);          
            if(stk.find(ch)!=-1 && ch!='(' && ch!=')')
            {
                int pref1=stk.find(ch);
                while(!stk.isEmpty())
                {
                    char top=stk.pop();
                    if(top == '(')
                    {
                        stk.push(top);
                        break;
                    }
                    else
                    {
                        int pref2=stk.find(top);
                        if(pref2<pref1)
                        {
                            stk.push(top);
                            break;
                        }
                        else output+=top;
                    }
                }
                stk.push(ch);
            }
            else if(ch==')' || ch=='(')
            {
                while(!stk.isEmpty())
                {
                    char top=stk.pop();
                    if(top=='(') break;
                    else output+=top;
                }
            }
            else output+=ch;
        }
        while(!stk.isEmpty()) output+=stk.pop();
        return output;
    }   
}

public class InfixPostfixConversion
{
    public static void main(String args[])
    {
        System.out.print("Enter the infix expression: ");
        InfixPostfix ip=new InfixPostfix(new Scanner(System.in).next());
        ip.show();
    }
}