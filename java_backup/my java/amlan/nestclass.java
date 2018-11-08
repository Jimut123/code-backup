import java.io.*;
class nestclass
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
class nestclass1
{   
int k,l;
void input1()throws IOException
    {
        System.out.println("Enter data in nested class:");
        k=Integer.parseInt(br.readLine());
        l=Integer.parseInt(br.readLine());
    }
    void disp1()
    {
        System.out.println("Data in nested class:");
        System.out.println(k);
         System.out.println(l);
        }
    }
int x;
    double y;
   nestclass1 n1=new nestclass1(); 
    void input()throws IOException
    {
        n1.input1();
        System.out.println("Enter data in outer class:");
        x=Integer.parseInt(br.readLine());
        y=Integer.parseInt(br.readLine());
    }
    void disp()
    {
        n1.disp1();
        System.out.println("Data in outer class:");
        System.out.println(x);
         System.out.println(y);
        }
        
        public static void main(String args[])throws IOException
        {
            nestclass nn=new nestclass();
            nn.input();
            nn.disp();
        }
}
