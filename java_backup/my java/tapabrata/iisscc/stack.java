package iisscc;

import java.io.*;
class stack
{int s[]=new int[100];
int top,i,k;
stack()
{top=-1;
}
void push(int x)
{k=x;
if(top>=100)
{System.out.println("Stack overflow");
return;
}
else
{s[++top]=k;
}
}
void pop()
{if(top==-1)
{System.out.println("Stack empty ");
return;
}
System.out.println("Popped out element is " +s[top]);
top--;

}
 void display()
{System.out.println("your stack ");
for(i=top;i>=0;i--)
{System.out.println(s[i]);
}
}
}