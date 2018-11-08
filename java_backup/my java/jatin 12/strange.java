import java.io.*;
class strange
{//declaration of class
    int s[],top,k,x;//inisialisation of variables
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    strange()throws IOException
    {//constructor to take input and call the right function
        s=new int[20];
        top=-1;
        do
        {
            System.out.println("Press 1 for PUSH");
            System.out.println("Press 2 for POP");
            System.out.println("Press 3 for DISPLAY");
            System.out.println("Press 4 for EXIT");
            System.out.println("Enter Choice");
            x=Integer.parseInt(br.readLine());
            switch(x)
            {//loop to call function
                case 1: push();
                        break;
                case 2:pop();
                        break;
                case 3:display();       
                        break;
                case 4:System.exit(0);
            }//end of loop
        }
        while(true);
    }//end of constructor
    void push()throws IOException
    {//function to input elements in stack
        System.out.println("Enter Number") ;
        k=Integer.parseInt(br.readLine());
        if(top>=20)
        {//checking space availability
            System.out.println("Stack Overflow");
            return ;
        }
        else
            s[++top]=k;
    }//end of push
    void pop()
    {//function to remove element from stack
        if(top<0)
        {//checking availability
            System.out.println("null");
            return;
        }
        else
        {//removing element
            System.out.println("Popped element: "+s[top]);
            top--;
        }
    }//end of pop
    void display()
    {//function to print the stack
        System.out.println("Your stack");
        for(int i=top;i>=0;i--)
        {//loop to print stack
            System.out.println(s[i]);
        }//end of stack
    }//end of function
}//end of class
    
      