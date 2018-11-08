
import PRIME.*;
import java.io.*;
public class DISPLAYNO extends RANGE
{
    
    int n;int x,i;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    DISPLAYNO()
    {
        n=0;
    }
    void Input()throws IOException
    {
        n=Integer.parseInt(br.readLine());
        //super.T.Input(n);
    }
    void display1()throws IOException
        { pri1 p=new pri1(); 
         
      for(i=1;i<=n;i++)
      {
         p.Input(i);
        }
        //super.T.display();
    }
}
        
        
    
   
        