import java.io.*;
class stack
{
  int s[]=new int[100];
  int i,top,x;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  void Stack()
  {
      top=-1;
  }
  void push()throws IOException
  {
      if(top>=100)
      {
          System.out.println("Stack Overflow");
          return;
      }
      else
      {
          x=Integer.parseInt(br.readLine());
          s[++top]=x;
      }
  }
  void pop()
  {
      System.out.println("Popped Element"+s[top]);
      top--;
  }
  void disp()
  {
      for(i=top;i>=0;i--)
      System.out.println(s[i]);
  }
  void impl()throws IOException
  {
      int k;
      do
      {
          System.out.println("Press 1 For Push");
          System.out.println("Press 2 For Pop");
          System.out.println("Press 3 For Display");
          System.out.println("ENTER CHOICES");
          x=Integer.parseInt(br.readLine());
          switch(x)
          {
              case 1: push();
                      break;        
              case 2:pop();
                     break;
              case 3:disp();
                     break;
              case 4:System.exit(0);
          }
          
      }
      while(true);
  }
}