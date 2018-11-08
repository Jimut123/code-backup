import java.io.*;
class telcall
{
    String name;
    int n ,phno;
    double amt;
    telcall(int x,String y,int k)
    {
        n=x;
        name=y;
        phno=k;
    }
    void compute()
    {
        if((n>=1)&&(n<=100))
        {
            amt = 500;
        }
        else if ((n>=101)&&(n<=200))
        {
            amt = 500+(double)(n-100)*1.00;
            
        }
        else if((n>=201)&&(n<=300))
        {
            amt=(double)500+100+(n-200)*1.20;
        }
        else if(n>300)
        {
            amt=(double)500+100+120+(n-300)*1.50;
        }
    }
    void display()
    {
        System.out.println("Phone no.\t\tName\t\tTotal calls\t\tAmount");
        System.out.println(n+"\t\t "+name+"\t\t"+n+"\t\t"+amt);
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("Enter the name:");
        String name1=cd.readLine();
        System.out.println("Enter the phone number:");
        int phno1 = Integer.parseInt(cd.readLine());
        System.out.println("Enter the number of calls:");
        int n1 = Integer.parseInt(cd.readLine());
        telcall ob = new telcall(n1,name1,phno1);
        ob.compute();
        ob.display();
    }
}