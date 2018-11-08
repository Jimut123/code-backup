import java.io.*;
class abc
{
int x;
DataInputStream d=new DataInputStream(System.in);
void input()throws IOException
{System.out.println("enter value:");
 x=Integer.parseInt(d.readLine());
 
 }
 void disp()
 {System.out.println("value="+x);
    }
  void comp(abc a1)
  { if(a1.x>x)
      {System.out.println("greater value="+a1.x);
        }
     else
     {System.out.println("greater value="+x);
        }
    }
    void add(abc a1)
    {a1.x=x+a1.x;
    }
}   