package stack_prog;
import java.io.*;
class input
{public static void main(String args[])throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
stack im=new stack();
int i;
do
{System.out.println(" Press 1. to push ");
System.out.println(" Press 2. to pop ");
System.out.println(" Press 3. to display ");
System.out.println(" Press 4. to exit ");
System.out.println(" Enter choice " );
i=Integer.parseInt(br.readLine());
switch(i)
{
case 1:int x;
x=Integer.parseInt(br.readLine());
im.push(x);
break;
case 2:im.pop();
break;
case 3:im.display();
break;
case 4:System.exit(0);
default :System.out.println("Invalid choice--------------------");
}
}while(true);
}
}

