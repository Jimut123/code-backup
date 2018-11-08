import java.io.*;
class abc
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int x,y,z;
    void input()throws IOException
    {
        System.out.println("Enter value");
        x=Integer.parseInt(br.readLine());
y=Integer.parseInt(br.readLine());
        
        
    }
    void add()
    {
        z=x+y;
        System.out.println(z);
    }
}
